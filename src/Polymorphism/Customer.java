package Polymorphism;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
//
//    public Customer() {
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//        System.out.println("Customer() call");
//    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        //System.out.println("Customer(int, String) call");
    }

    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        return price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerName + "님은 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint + "입니다. ";
    }
}
