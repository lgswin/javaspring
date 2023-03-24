package CardDeck;

public class DeckEx {
    public static void main(String[] args) {
        // Deck의 생성자를 호출하면 항상 포함된 클래스부터 생성을 먼저함 (중요)
        Deck d = new Deck();
        Card c = d.pick(0);

        // 0번을 선택했으므로 제일 첫번째 스페이드, 1이 선택
        System.out.println("카드를 섞기 전에 제일 위에 있는 카드 : ");
        System.out.println(c.toString());

        d.shuffle();
        c = d.pick(0);

        System.out.println("카드를 섞은 후에 제일 위에 있는 카드 : ");
        System.out.println(c.toString());
    }
}
