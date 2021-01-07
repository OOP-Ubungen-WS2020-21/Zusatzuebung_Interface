package Inheritance;

public class Bulldog extends Dog{

    private boolean breedingDisease;

    public Bulldog(boolean breedingDisease) {
        super(false, true);
        this.breedingDisease = breedingDisease;
    }
}
