package Cooperation;

public class People {
    String name;
    int money;

    public People(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println(this.name + "님의 남은 돈은 " + this.money + "원 입니다." );
    }
}
