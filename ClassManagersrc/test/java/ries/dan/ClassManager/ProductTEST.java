package ries.dan.ClassManager;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by danries on 1/18/17.
 */
public class ProductTEST {

    Product milk;

    @Before public void initialize() {
        milk = new Product(3.69, 1, 6);
    }
    @Test
    public void getPriceTEST(){
        double actual = milk.getPrice();
        double expected = 3.69;
        assertEquals("We expect to get 3.69", expected, actual, 0);
    }
    @Test
    public void getQuantityTEST(){
        int actual = milk.getQuantity();
        int expected = 6;
        assertEquals("We expect to get 6", expected, actual, 0);
    }
}
