package ries.dan.ClassManager;

/**
 * Created by danries on 1/18/17.
 */
public class Main {

    public static void main(String[] args){

        Product milk = new Product(3.45, 1, 6);
        Product bread = new Product(2.50, 2, 12);
        Product eggs = new Product(1.49, 3, 6);

        Inventory inventory = new Inventory();

        inventory.addProduct(milk);
        inventory.addProduct(bread);
        inventory.addProduct(eggs);

        System.out.println("$" + inventory.getSum() + " worth of products in inventory.");
    }

}
