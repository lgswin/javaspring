package Polymorphism;

// 자손 클래스
public class Defender extends Player{

    private int def;

    public Defender(String name, int age, int backNumber, int speed, int shoot) {
        super(name, age, backNumber, speed);
        this.def = shoot;
    }

    public int getDef() {
        return this.def;
    }

    @Override
    public void info() {
        super.info(); // Player의 info를 먼저 호출
        System.out.println("Count of blocks : " + this.getDef());
    }
}
