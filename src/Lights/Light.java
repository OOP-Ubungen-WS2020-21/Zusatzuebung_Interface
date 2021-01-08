package Lights;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.MousePressedEvent;
import de.ur.mi.oop.graphics.Rectangle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;


public class Light extends GraphicsApp {

    private static final int CANVAS_SIZE = 500;
    private static final int SWITCHER_SIZE = 80;
    private static final float SWITCHER_BORDER = 1.f;
    private Rectangle switcher;
    private LightBulb light;

    @Override
    public void initialize() {
        setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
        switcher = new Rectangle(SWITCHER_SIZE/2, CANVAS_SIZE - SWITCHER_SIZE-SWITCHER_SIZE/2, SWITCHER_SIZE, SWITCHER_SIZE, Colors.WHITE);
        switcher.setBorder(Colors.BLACK, SWITCHER_BORDER);
        light = new LightBulb(CANVAS_SIZE/2);
    }

    @Override
    public void draw() {
        switcher.draw();
        light.draw();
    }

    @Override
    public void onMousePressed(MousePressedEvent mousePressedEvent){
        if(switcher.hitTest(mousePressedEvent.getXPos(), mousePressedEvent.getYPos())){
        }
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}
