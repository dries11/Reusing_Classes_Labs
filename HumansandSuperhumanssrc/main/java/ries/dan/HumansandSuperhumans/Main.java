package ries.dan.HumansandSuperhumans;

/**
 * Created by danries on 1/18/17.
 */
public class Main {

    public static void main(String[] args){
        SuperHuman Bob = new SuperHuman("Bob", 26, "male", "Garbage Man", "23 Jordan Drive", "good", "Michael Jordan", "Hooper");
        SuperHuman Alice = new SuperHuman("Alice", 28, "female", "Doctor", "25 Jordan Way", "bad", "Bill Gates", "Super Sales");

        System.out.println(Alice.getHeroName());
        System.out.println(Alice.getAddress());
        System.out.println(Alice.getAbility());
    }

}
