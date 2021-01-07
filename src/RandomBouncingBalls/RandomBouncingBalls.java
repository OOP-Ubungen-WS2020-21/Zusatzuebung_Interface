package RandomBouncingBalls;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class RandomBouncingBalls extends GraphicsApp {


    static final int CANVAS_HEIGHT = 800;
    static final int CANVAS_WIDTH = 800;
    static final int FRAME_RATE = 60;
    static final Color BACKGROUND_COLOR = Colors.WHITE;
    

    /**
     * the initialize-Methode gets called a single time at the start of the programm
     **/

    @Override
    public void initialize() {
        setupCanvas();
    }



    private void setupCanvas() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        setFrameRate(FRAME_RATE);
    }

    /**
     * the draw-method gets called repeated as long the programm is running
     **/

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);

    }



    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}
