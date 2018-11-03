
import javax.swing.*;
import java.awt.*;

public class Block {

    private Vector3 Position;
    private Vector3 Size;

    private Vector3[] verticies = {
        new Vector3(-1, 1, 1),
        new Vector3(1, 1, 1),
        new Vector3(1, -1, 1),
        new Vector3(-1, -1, 1),
        new Vector3(-1, 1, -1),
        new Vector3(1, 1, -1),
        new Vector3(1, -1, -1),
        new Vector3(-1, -1, -1)
    };

    private Vector2[] edges = {
        new Vector2(0, 1),
        new Vector2(1, 2),
        new Vector2(2, 3),
        new Vector2(3, 0),
        new Vector2(4, 5),
        new Vector2(5, 6),
        new Vector2(6, 7),
        new Vector2(7, 4),
        new Vector2(0, 4),
        new Vector2(1, 5),
        new Vector2(2, 6),
        new Vector2(3, 7),
    };

    public Block() {

    }

    public Block(Vector3 positon, Vector3 size) {
        this.Position = positon;
        this.Size = size;
    }

    public void update() {

    }

    public void display() {

        Graphics g = new Graphics();

        for (int i = 0; i <= 7; i++) {
            Vector3 myVec = verticies[i];

            int x = myVec.getX();
            int y = myVec.getY();
            int z = myVec.getZ();

            //z = z + 5;

            int f = (int) (200 / z);
            x *= f;
            y *= f;

            g.drawOval(x + 500, y + 500, 5, 5);
            //g.drawOval(x + ScreenClass.getMidX(), y + ScreenClass.getMidY(), 5, 5);
        }
    }
}