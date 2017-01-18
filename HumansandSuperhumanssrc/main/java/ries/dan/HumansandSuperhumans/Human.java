package ries.dan.HumansandSuperhumans;

/**
 * Created by danries on 1/18/17.
 */
public class Human {

    String name;
    String gender;
    String occupation;
    String address;
    int age;

    public Human(String name, int age, String gender, String occupation, String address ){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

}
