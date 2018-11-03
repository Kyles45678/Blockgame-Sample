import java.awt.Dimension;

public class ScreenClass {
    private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public static int getMidX() {
        return screenSize.getWidth() / 2;
    }

    public static int getMidY() {
        return screenSize.getHeight() / 2;
    }

    public static toString() {
        System.out.println("Mid X + " + screenSize.getWidth()/2 + "\nMid Y = " + screenSize.getHeight()/2);
    }
}