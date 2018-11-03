
import javax.swing.*;
import java.awt.*;

public class Game {

    private static boolean isRunning = true;
    public static JFrame mainWindow;
    public static DrawPanel panel;
    public static Container pane;

    public static void load() {
        mainWindow = new JFrame();

        mainWindow.setTitle("Ocampo Craft");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(600, 480);
        mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //frame.setUndecorated(true);

        panel = new DrawPanel(Color.white);
        pane = mainWindow.getContentPane();
        pane.add(panel);

        mainWindow.setVisible(true);
        //Hi
    }

    public static void run() {

        long lastLoopTime = System.nanoTime();
        final double TARGET_FPS = 1 / 60;
        double accumulatedTime = 0;

        Block test = new Block();

        while (isRunning) {
            double delta = System.nanoTime() - lastLoopTime;
            lastLoopTime = System.nanoTime();

            accumulatedTime += delta;

            if (accumulatedTime >= TARGET_FPS) {
                accumulatedTime -= TARGET_FPS;

                //Updates
                test.draw(new JPanel().paintComponents(g));
            }
        }
    }

    public static void setGameLoop(boolean value) {
        isRunning = value; 
    }
}