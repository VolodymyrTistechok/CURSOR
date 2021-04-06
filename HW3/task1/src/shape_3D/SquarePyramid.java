package shape_3D;

import shape_classes.SpaceShape;
import vertices.vertices3D;

import java.util.ArrayList;

public class SquarePyramid extends SpaceShape {
    private final double baseWidth;
    private final double height;

    public SquarePyramid(vertices3D pointA, int baseWidth, int height) {
        vertices = new ArrayList<>();
        vertices.add(pointA);
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public vertices3D getPointA() {
        return vertices.get(0);
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public double getHeight() {
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
                "center " + vertices.get(0) +
                ", baseWidth = " + baseWidth +
                ", height = " + height +
                ", Area = " + getArea() +
                ", Volume = " + getVolume();
    }
}
