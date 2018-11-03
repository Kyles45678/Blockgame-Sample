public class ScreenClass {
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public static int getMidX() {
        return screenSize.getWidth() / 2;
    }

    public static int getMidY() {
        return screenSize.getHeight() / 2;
    }
}