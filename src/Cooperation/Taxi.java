package Cooperation;

public class Taxi {
    String company;
    int money;

    public Taxi(String company, int money) {
        this.company = company;
        this.money = money;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showInfo() {
        System.out.println(this.company + " 운수택시 수입은 "+ this.money+ "원 입니다.");
    }
}
