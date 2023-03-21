package Cooperation;

public class Bus {
    int number;
    int passengerCount;
    int money;

    public Bus(int number) {
        this.number = number;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusinfo() {
        System.out.println(this.number + "번의 승객 수는 " + this.passengerCount +"명이고, 수입은 " + this.money +"원입니다.");
    }

}
