package ries.dan.ClassManager;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by danries on 1/18/17.
 */
public class InventoryTEST {

    Product milk;
    Product eggs;
    List<Product> products;
    Inventory inventory = new Inventory();

    @Before public void initialize() {
        milk = new Product(3.69, 1, 6);
        eggs = new Product(2.50, 2, 3);
        inventory.addProduct(milk);
        inventory.addProduct(eggs);
    }

    @Test
    public void getSumTEST(){
        double actual = inventory.getSum();
        double expected = 29.64;
        assertEquals("We expect to get 29.64",expected,actual,0);
    }

}
