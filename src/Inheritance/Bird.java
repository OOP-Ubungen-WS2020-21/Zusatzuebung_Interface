package Inheritance;

public class Bird extends Animal implements FlyingObject{

    private float maxSpeed;


    public Bird(float maxSpeed) {
        super("chrip", false);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
