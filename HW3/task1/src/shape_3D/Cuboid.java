package shape_3D;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import shape_classes.Shape;
import shape_classes.SpaceShape;

public class Cuboid extends Shape implements AreaMeasurable, VolumeMeasurable {
    private final SpaceShape center;
    private final int width;
    private final int height;
    private final int depth;

    public Cuboid(SpaceShape pointA, int width, int height, int depth) {
        this.center = pointA;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public SpaceShape getPointA() {
        return center;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " +
                "center " + center +
                ", width = " + width +
                ", height = " + height +
                ", depth = " + depth +
                ", Area = " + getArea() +
                ", Volume = " + getVolume();
    }
}
