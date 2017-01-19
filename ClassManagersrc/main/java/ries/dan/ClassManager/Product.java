package ries.dan.ClassManager;

/**
 * Created by danries on 1/18/17.
 */
public class Product {

    private double price ;
    private int id;
    private int quantity;

     public Product(double price, int id, int quantity){
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


}
