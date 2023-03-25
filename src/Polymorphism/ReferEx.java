package Polymorphism;

public class ReferEx {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();

        // 멤버변수는 근본을 벗어나지 못함
        System.out.println(parent.x); // parent의 x값 출력
        System.out.println(child.x); // child의 x값 출력

        // 멤버메서드는 현재 참조하고 있는 인스턴스에 영향을 받음.
        parent.method(); // 자손의 method 호출 (오버라이딩된 메서드)
        child.method(); // 자손의 method 호출 (오버라이딩된 메서드)

        parent.type(new Child());
    }
}
