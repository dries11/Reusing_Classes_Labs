package ries.dan.ClassManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danries on 1/18/17.
 */
public class Inventory{

    private double sum;
    private List<Product> products;

    public Inventory() {
        sum = 0;
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
//      sum += product.getPrice() * product.getQuantity();
        products.add(product);
    }

    public double getSum() {
        sum = 0;
        for (Product product : products){
            sum += product.getPrice() * product.getQuantity();
        }
        return sum;
    }

    public List<Product> getProducts() {
        return products;
    }

}
