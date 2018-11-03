
import javax.swing.*;
import java.awt.*;

public class Game {

    private static boolean isRunning = true;
    public static JFrame mainWindow;

    public static void load() {
        mainWindow = new JFrame();

        mainWindow.setTitle("Ocampo Craft");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(600, 480);
        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //frame.setUndecorated(true);

        DrawPanel panel = new DrawPanel(Color.white);
        Container pane = mainWindow.getContentPane();
        pane.add(panel);

        mainWindow.setVisible(true);
        //Hi
    }

    public static void run() {

        long lastLoopTime = System.nanoTime();
        final double TARGET_FPS = 1 / 60;
        double accumulatedTime = 0;

        while (isRunning) {
            double delta = System.nanoTime() - lastLoopTime;
            lastLoopTime = System.nanoTime();

            accumulatedTime += delta;

            if (accumulatedTime >= TARGET_FPS) {
                accumulatedTime -= TARGET_FPS;

                //Updates
                
            }
        }
    }

    public static void setGameLoop(boolean value) {
        isRunning = value; 
    }
}