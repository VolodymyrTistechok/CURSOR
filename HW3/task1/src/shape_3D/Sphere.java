package shape_3D;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import shape_classes.Shape;
import shape_classes.SpaceShape;

public class Sphere extends Shape implements AreaMeasurable, VolumeMeasurable {
    private final SpaceShape center;
    private final int radius;

    public Sphere(SpaceShape center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public SpaceShape getCenter() {
        return center;
    }

    public int getRadius() {
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
                "center " + center +
                ", radius = " + radius +
                ", Area = " + getArea() +
                ", Volume = " + getVolume();
    }
}
