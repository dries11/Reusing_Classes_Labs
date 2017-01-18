package ries.dan.RotateArray;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by danries on 1/18/17.
 */
public class Main {


    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(0,1,2,3,4,5));

        List.rotate(3, numbers);
        System.out.println(numbers);
    }


}
