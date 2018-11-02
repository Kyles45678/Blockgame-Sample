import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Camera {
    private double xPos, yPos;
    private boolean left, right, up, down, forward, back;

    public Camera() {
        xPos = 0;
        yPos = 0;
        left = false;
        right = false;
        up = false;
        down = false;
        forward = false;
        back = false;
    }

    public Camera(int x, int y) {
        xPos = x;
        yPos = y;
    }

    // detects for key presses
    public void keyPressed(KeyEvent key) {
        if(key.getKeyCode == KeyEvent.VK_A)
            left = true;
        if(key.getKeyCode == KeyEvent.VK_D)
            right = true;
        if(key.getKeyCode == KeyEvent.VK_SPACE)
            up = true;
        if(key.getKeyCode == KeyEvent.VK_SHIFT)
            down = true;
        if(key.getKeyCode == KeyEvent.VK_W)
            forward = true;
        if(key.getKeyCode == KeyEvent.VK_S)
            back = true;
    }

    // detects for key releases
    public void keyReleased(KeyEvent key) {
        if(key.getKeyCode == KeyEvent.VK_A)
            left = false;
        if(key.getKeyCode == KeyEvent.VK_D)
            right = false;
        if(key.getKeyCode == KeyEvent.VK_SPACE)
            up = false;
        if(key.getKeyCode == KeyEvent.VK_SHIFT)
            down = false;
        if(key.getKeyCode == KeyEvent.VK_W)
            forward = false;
        if(key.getKeyCode == KeyEvent.VK_S)
            back = false;
    }
    
    public update() {
        
    }
}