package shape_classes;

public class SpaceShape extends PlaneShape {

    int z;

    public SpaceShape(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(x=" + x + ", y=" + y + ", z=" + z + ")";
    }
}
