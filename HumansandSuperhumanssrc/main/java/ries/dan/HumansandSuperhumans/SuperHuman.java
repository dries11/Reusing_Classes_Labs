package ries.dan.HumansandSuperhumans;

/**
 * Created by danries on 1/18/17.
 */
public class SuperHuman extends Human {

    String behavior;
    String heroName;
    String ability;

    public SuperHuman(String name, int age, String gender, String occupation, String address,  String behavior, String heroName , String ability ){
        super(name, age, gender, occupation, address);
        this.behavior = behavior;
        this.heroName = heroName;
        this.ability = ability;
    }


    public String getBehavior() {
        return behavior;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getAbility() {
        return ability;
    }


}
