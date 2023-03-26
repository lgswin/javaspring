package Polymorphism;

import Abstract.A;

public class PolyArgument {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new TV());
        buyer.buy(new Audio());
        buyer.buy(new Computer());
        // buyer.buy(new Apple()); // Apple은 Product의 자손이 아니므로 에러발생!

        System.out.println("현재 남은 돈은 : "+buyer.money + "만원입니다.");
        System.out.println("현재 보너스포인트는 : "+buyer.bonusPoint + "점입니다.");

        // 필드의 다형성
        Product p1 = new TV();
        Product p2 = new Computer();
        Product p3 = new Audio();
        Product[] pArray = new Product[10];
    }
}
