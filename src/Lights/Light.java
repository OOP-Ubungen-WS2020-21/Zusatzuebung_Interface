package Lights;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.MousePressedEvent;
import de.ur.mi.oop.graphics.Rectangle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;


public class Light extends GraphicsApp {

    private static final int CANVAS_SIZE = 500;
    private static final int SWITCHER_SIZE = 80;
    private static final float SWITCHER_BORDER_WEIGHT = 1.f;
    private static final Color SWITCHER_COLOR = Colors.WHITE;
    private static final Color SWITCHER_BORDER_COLOR = Colors.BLACK;

    private Rectangle switcher;
    private Lightbulb light;
    private SwitchListener switchListener;

    @Override
    public void initialize() {
        setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);

        initializeSwitcher();
        light = new Lightbulb(CANVAS_SIZE/2);
        switchListener = light;
    }

    private void initializeSwitcher() {
        switcher = new Rectangle(SWITCHER_SIZE/2, CANVAS_SIZE - SWITCHER_SIZE-SWITCHER_SIZE/2, SWITCHER_SIZE, SWITCHER_SIZE, SWITCHER_COLOR);
        switcher.setBorder(SWITCHER_BORDER_COLOR, SWITCHER_BORDER_WEIGHT);
    }

    @Override
    public void draw() {
        switcher.draw();
        light.draw();
    }

    @Override
    public void onMousePressed(MousePressedEvent mousePressedEvent){
        if(switcher.hitTest(mousePressedEvent.getXPos(), mousePressedEvent.getYPos())){
            switchListener.changeLightState();
        }
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}
