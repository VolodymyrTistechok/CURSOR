package shape_3D;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import shape_classes.Shape;
import shape_classes.SpaceShape;

public class SquarePyramid extends Shape implements AreaMeasurable, VolumeMeasurable {
    private final SpaceShape center;
    private final int baseWidth;
    private final int height;

    public SquarePyramid(SpaceShape pointA, int baseWidth, int height) {
        this.center = pointA;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public SpaceShape getPointA() {
        return center;
    }

    public int getBaseWidth() {
        return baseWidth;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        double apothem = Math.sqrt(Math.pow(height, 2) + Math.pow(baseWidth / 2, 2));
        return Math.pow(baseWidth, 2) + (2 * baseWidth * apothem);
    }

    @Override
    public double getVolume() {
        return (Math.pow(baseWidth, 2) * height) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid: " +
                "center " + center +
                ", baseWidth = " + baseWidth +
                ", height = " + height +
                ", Area = " + getArea() +
                ", Volume = " + getVolume();
    }
}
