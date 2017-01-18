package ries.dan.RotateArray;
import java.util.ArrayList;
/**
 * Created by danries on 1/18/17.
 */
public class List extends Main {

    public static void rotate(int k, ArrayList numbers){
        numbers.addAll(numbers.subList(0,k));
        numbers.removeAll(numbers.subList(0,k));
    }
}
