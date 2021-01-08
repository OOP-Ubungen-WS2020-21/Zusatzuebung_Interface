package Lights;

import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.graphics.Line;

public class LightBulb {

    private static final Color COLOR_OFF = Colors.WHITE;
    private static final Color COLOR_ON = Colors.YELLOW;
    private static final float Y_POS = 80;
    private static final float RADIUS = 50;
    private static final Color BORDER_COLOR = Colors.BLACK;
    private static final float BORDER_WEIGHT = 3.f;
    private static final float START_POS_CABLE = 0;


    private boolean turnedOn = false;
    private Line cable;
    private Circle lightBulb;

    public LightBulb(float x) {
        lightBulb = new Circle(x, Y_POS, RADIUS, COLOR_OFF);
        lightBulb.setBorder(Colors.BLACK, 1.f);
        cable = new Line(x, Y_POS, x,START_POS_CABLE, BORDER_COLOR, BORDER_WEIGHT);
    }


    private void setColor(){
        if(turnedOn){
            lightBulb.setColor(COLOR_ON);
        } else {
            lightBulb.setColor(COLOR_OFF);
        }
    }

    public void draw(){
        cable.draw();
        lightBulb.draw();
    }

}
