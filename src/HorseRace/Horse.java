package HorseRace;

import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;

import java.util.Random;

public class Horse {

    private static int horseCount = 0;
    private int id;
    private int CANVAS_WIDTH;
    private boolean running = true;
    private Circle circle;
    static Random random = new Random();
    private float horseSpeed = 5;


    public Horse(float YPos, float radius, int CANVAS_WIDTH) {
        horseCount++;
        id = horseCount;
        this.CANVAS_WIDTH = CANVAS_WIDTH;
        circle = new Circle(0 + radius, YPos, radius, Colors.getRandomColor());
    }


    public void draw() {
        circle.draw();
    }

    public void update() {
        if (running) {
            float dx = random.nextFloat() * horseSpeed;
            float newX = circle.getXPos() + dx;
            circle.setPosition(newX, circle.getYPos());
            checkIfFinish();
        }
    }

    private void checkIfFinish() {
        if (circle.getRightBorder() >= CANVAS_WIDTH) {
            running = false;
        }
    }

}
