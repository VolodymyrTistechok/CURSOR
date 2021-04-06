package vertices;

public class vertices3D extends vertices2D{
    public double z;

    public vertices3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(x=" + x + ", y=" + y + ", z=" + z + ")";
    }
}
