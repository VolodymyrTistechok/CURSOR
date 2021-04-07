package shape_3D;

import shape_classes.SpaceShape;
import vertices.Vertices3D;

import java.util.ArrayList;

public class Sphere extends SpaceShape {
    private final double radius;

    public Sphere(Vertices3D center, int radius) {
        vertices = new ArrayList<>();
        vertices.add(center);
        this.radius = radius;
    }

    public Vertices3D getCenter() {
        return vertices.get(0);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere: " +
                "center " + vertices.get(0) +
                ", radius = " + radius +
                ", Area = " + getArea() +
                ", Volume = " + getVolume();
    }
}
