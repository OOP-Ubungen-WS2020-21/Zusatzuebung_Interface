package Inheritance;

public class Dog extends Animal {

    boolean fightingDog;
    boolean huntDog;


    public Dog( boolean fightingDog, boolean huntDog) {
        super("bark",true);
        this.fightingDog = fightingDog;
        this.huntDog = huntDog;

    }

}