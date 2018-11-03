
import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public DrawPanel(Color backColor) {
        setBackground(backColor);
    }

    public void paintComponent(Graphics g) {

        Block test = new Block();

        super.paintComponent(g);

        g.setColor(Color.blue);
        g.drawRect(10, 5, 120, 20);

        test.display(g);
    }

}