package Polymorphism;

public class GoldCustomer extends Customer {

    double salesRation;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        salesRation = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price*salesRation);
    }
}
