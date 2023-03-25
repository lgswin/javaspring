package Polymorphism;

// 자손 클래스
public class MidFielder extends Player{

    private int pass;

    public MidFielder(String name, int age, int backNumber, int speed, int shoot) {
        super(name, age, backNumber, speed);
        this.pass = shoot;
    }

    public int getPass() {
        return this.pass;
    }

    @Override
    public void info() {
        super.info(); // Player의 info를 먼저 호출
        System.out.println("Count of passes : " + this.getPass());
    }
}
