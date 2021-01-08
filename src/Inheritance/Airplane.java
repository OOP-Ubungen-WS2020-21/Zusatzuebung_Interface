package Inheritance;

public class Airplane implements FlyingObject {

    private String name;
    private float maxSpeed;


    public Airplane(String name, float maxSpeed){
        this.name = name;
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
