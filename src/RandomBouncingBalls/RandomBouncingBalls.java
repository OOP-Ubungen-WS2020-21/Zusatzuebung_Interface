package RandomBouncingBalls;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class RandomBouncingBalls extends GraphicsApp implements Constants {

    private RandomBall[] balls;



    /**
     * the initialize-Methode gets called a single time at the start of the programm
     **/

    @Override
    public void initialize() {
        setupCanvas();
        setupRandomBalls();
    }

    private void setupRandomBalls() {

        balls = new RandomBall[BALLS_AMOUNT];

        for (int i = 0; i < BALLS_AMOUNT; i++) {
            balls[i] = new RandomBall(CANVAS_WIDTH, CANVAS_HEIGHT, MIN_BALL_VELOCITY, MAX_BALL_VELOCITY);
        }

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
        drawBalls();
    }

    private void drawBalls() {
        for (int i = 0; i < BALLS_AMOUNT; i++) {
            drawBall(balls[i]);
        }
    }

    private void drawBall(RandomBall ball) {
        ball.checkWallCollision(CANVAS_WIDTH, CANVAS_HEIGHT);
        ball.update();
        ball.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}
