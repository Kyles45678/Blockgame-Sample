
import javax.swing.*;
import java.awt.*;

public class MainProgram {
    public static void main(String args[]) {
        
        JFrame mainWindow = new JFrame();

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
}