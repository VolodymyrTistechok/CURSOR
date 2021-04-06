package shape_3D;

import shape_classes.SpaceShape;
import vertices.vertices3D;

import java.util.ArrayList;

public class Cuboid extends SpaceShape {
    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(vertices3D pointA, int width, int height, int depth) {
        vertices = new ArrayList<>();
        vertices.add(pointA);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public vertices3D getCenter() {
        return vertices.get(0);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
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
                "center " + vertices.get(0) +
                ", width = " + width +
                ", height = " + height +
                ", depth = " + depth +
                ", Area = " + getArea() +
                ", Volume = " + getVolume();
    }
}
