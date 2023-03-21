package Cooperation;

public class Subway {
    int linenumber;
    int passengerCount;
    int money;

    public Subway(int number) {
        this.linenumber = number;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusinfo() {
        System.out.println(this.linenumber + "번 노선의 승객 수는 " + this.passengerCount +"명이고, 수입은 " + this.money +"원입니다.");
    }

}
