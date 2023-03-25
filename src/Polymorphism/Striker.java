package Polymorphism;

// 자손 클래스
public class Striker extends Player{

    private int shoot;

    public Striker(String name, int age, int backNumber, int speed, int shoot) {
        super(name, age, backNumber, speed);
        this.shoot = shoot;
    }

    public int getShoot() {
        return this.shoot;
    }

    @Override
    public void info() {
        super.info(); // Player의 info를 먼저 호출
        System.out.println("Valid Shootings : " + this.getShoot());
    }
}
