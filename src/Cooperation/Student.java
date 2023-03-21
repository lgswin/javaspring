package Cooperation;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this. money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(this.name + "님의 남은 돈은 " + this.money + "원 입니다." );
    }
}
