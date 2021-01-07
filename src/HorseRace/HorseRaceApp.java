package HorseRace;

import HorseRace.FinishListener;
import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Label;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

import java.util.ArrayList;

public class HorseRaceApp extends GraphicsApp implements FinishListener {

    private static final int CANVAS_HEIGHT = 600;
    private static final int CANVAS_WIDTH = 1000;
    private static final int FRAME_RATE = 60;
    

    private Horse[] horses;
    private int horsesAmount = 10;
    private float horseRadius = (CANVAS_HEIGHT / (float) horsesAmount) / 2;
    private int place = 1;
    private Label finishLabel;
    private String finishText = " Winner: ";
    private ArrayList<Label> scoreBoard;
    private int FONT_SIZE = 20;
    private float TEXT_START_POS_Y = 100;
    private Color TEXT_COLOR = Colors.BLACK;


    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }


    @Override
    public void initialize() {
        setupCanvas();
        initHorses();
    }

    private void setupCanvas() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        setFrameRate(FRAME_RATE);
        initLabels();


    }

    private void initLabels() {
        finishLabel = new Label(0, TEXT_START_POS_Y, finishText);
        finishLabel.setFontSize(FONT_SIZE);
        finishLabel.setColor(TEXT_COLOR);

        scoreBoard = new ArrayList<>();
    }

    private void initHorses() {
        horses = new Horse[horsesAmount];
        for (int i = 0; i < horses.length; i++) {
            float yPos = ((CANVAS_HEIGHT / (float) horsesAmount) * i) + horseRadius;
            horses[i] = new Horse(yPos, horseRadius, CANVAS_WIDTH, this);
        }
    }

    @Override
    public void draw() {
        updateHorses();
        drawHorses();
        drawLabels();
    }

    private void drawLabels() {
        finishLabel.draw();
        for (int i = 0; i < scoreBoard.size(); i++) {
            scoreBoard.get(i).draw();
        }
    }

    private void updateHorses() {

        for (int i = 0; i < horses.length; i++) {
            horses[i].update();
        }
    }


    private void drawHorses() {
        for (int i = 0; i < horses.length; i++) {
            horses[i].draw();
        }
    }

    @Override
    public void hasEnteredFinishLine(int horseId) {
        float yPos = TEXT_START_POS_Y + (FONT_SIZE * (scoreBoard.size() + 1));
        String finishText = place + " : Horse " + horseId;
        Label label = new Label(0, yPos, finishText, TEXT_COLOR);
        scoreBoard.add(label);
        place++;
    }
}
