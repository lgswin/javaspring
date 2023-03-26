package Polymorphism;
// 독립클래스
public class Buyer {
    int money = 1000; // 고객 소유 금액
    int bonusPoint = 0; // 보너스 점수
    // 아래와 같이 코드를 짜면 안된다!!!
//    public void buy(TV tv) {
//        if (this.money < tv.price) {
//            System.out.println("잔액이 부족하여 물건구입이 안됩니다.");
//            return;
//        }
//
//        this.money -= tv.price;
//        this.bonusPoint += tv.bonusPoint;
//        System.out.println(tv + "를 구매하셨습니다.");
//    }

    // 여기서 매개변수 Product타입이 왔다는 것은 무엇을 의미하는가?
    // Product 이거나 그 자손들은 다 올수 있다는 것을 의미한다. (매개변수의 다형성)
    public void buy(Product p) {
        if (this.money < p.price) {
            System.out.println("잔액이 부족하여 물건구입이 안됩니다.");
            return;
        }

        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구매하셨습니다.");
    }
}
