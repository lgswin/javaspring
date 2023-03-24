package CardDeck;

public class Deck {
    final int CARD_NUM = 52; // 전체 카드의 갯수

    // 객체 배열 (2차원 배열 타입)
    Card[] c = new Card[CARD_NUM]; // 카드 인스턴스를 위한 메모리 확보

    // 초기화 블럭
    int i = 0;
    {
        // 52번 돌면서 초기화
        for (int k = Card.KIND_MAX; k > 0 ; k--) {
            for (int n = 1; n < Card.NUM_MAX+1; n++) {
                c[i++] = new Card(k, n); // kind, number로 생성
            }
        }
        // 제대로 초기화가 이루어졌는지 내용을 직접 출력해봄
        /*
        for (int j = 0; j < c.length; j++) {
            System.out.printf("C[%d]의 무늬: %d , C[%d]의 숫자: %d", j, c[j].kind, j, c[j].number);
            System.out.println();
        }
         */
    }

    public Deck() {
        System.out.println("Deck 의 기본 생성됨");
    }
    // 지정된 위치(index)에 있는 카드 하나를 선택
    public Card pick(int index) {
        if (0 <= index && index < CARD_NUM) { // 값이 지정되어 호출되는 경우 해당 값을 리턴함
            return c[index];
        }
        else { // 나머지 경우는 random pick
            return pick();
        }
    }

    // pick() 메서드 오버로딩
    public Card pick() {
        int index = (int)(Math.random()*CARD_NUM);
        System.out.println("임의로 뽑은 카드 ");
        System.out.printf("%d", index);
        return pick(index); // random pick이지만 다시 해당 random index로 pick 호출
    }

    // 단순히 섞는 메서드
    public void shuffle() {
        for (int j = 0; j < 1000; j++) {
            // 카드를 무 작위로 섞는다.
            int i = (int) (Math.random()*CARD_NUM); // 카드 갯수만큼 숫자를 뽑아줌
            Card temp = c[0];
            c[0] = c[i];
            c[i] = temp;
            /*
            System.out.println();
            System.out.println("카드를 섞은 후 결과 : ");

            for (int k = 0; k < c.length; k++) {
                System.out.printf("C[%d]의 무늬: %d , C[%d]의 숫자: %d", k, c[k].kind, k, c[k].number);
                System.out.println();
            }
             */
        }
    }
}

