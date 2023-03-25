package Polymorphism;

public class PlayerEx {
    public static void main(String[] args) {
        // 다형성 미적용
        System.out.println("=== 다형성 미적용 : Player");
        Player p1 = new Player("Lee", 40, 20, 60);
        p1.info();

        // 다형성 적용
        // 하지만 근본은 벗어나지 못한다. Striker클래스에 있는 getShoot()메서드는
        // p2 참조변수가 접근이 안된다.
        System.out.println("=== 다형성 적용 : Striker");
        Player p2 = new Striker("Kim", 25, 10, 90, 50);
        // p2.getShoot(); // Striker 객체로 선언된것이 아니기때문에 getShoot을 쓸수가 없다. (Player에는 getShoot이 없음)
        p2.info(); // 오버라이딩된 메서드는 호출됨

        System.out.println("=== 다형성 적용 : MidFielder");
        Player p3 = new MidFielder("Kang", 18, 18, 80, 120);
        p3.info();

        System.out.println("=== 다형성 적용 : Defender");
        Player p4 = new Defender("Young", 28, 18, 60, 60);
        p4.info();
    }
}
