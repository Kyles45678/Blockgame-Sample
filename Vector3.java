
public class Vector3 {

    private int x;
    private int y;
    private int z;

    //Constructors
    public Vector3() {
        this(0, 0, 0);
    }

    public Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3(Vector3 v3) {
        this(v3.getX(), v3.getY(), v3.getZ());
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    //Setters
}