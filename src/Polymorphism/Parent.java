package Polymorphism;

public class Parent {
    int x = 100;

    // 메개변수의 타입이 Object라는 것은 어떠한 클래스도 다 받아주겠다는 것!
    public void type(Object obj) {
        if (obj instanceof Parent) {
            Parent parent = (Parent) obj; // 강제 타입캐스팅
            System.out.println("조상클래스의 멤버 x 값 : " + this.x);
        }
        else {
            System.out.println("상속관계에 있지 않은 클래스입니다.");
        }

    }

    public void method() {
        System.out.println("조상 메서드 호출");
    }
}
