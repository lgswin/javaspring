package Polymorphism;

import javax.swing.*;

// Parent Class
public class NewProduct {
    private int productID;
    private String description;
    private String maker;
    private int price;

    public NewProduct(int productID, String description, String maker, int price) {
        super();
        this.productID = productID;
        this.description = description;
        this.maker = maker;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public String getDescription() {
        return description;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public void showInfo() {
        System.out.println("Product ID >> " + this.getProductID() + 1);
        System.out.println("Product detail >> " + this.getDescription());
        System.out.println("Producer >> " + this.getMaker());
        System.out.println("Price >> " + this.getPrice());
    }
}
