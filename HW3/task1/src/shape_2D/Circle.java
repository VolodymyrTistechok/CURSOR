package shape_2D;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import shape_classes.PlaneShape;
import shape_classes.Shape;

public class Circle extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private final PlaneShape pointA;
    private final int radius;

    public Circle(PlaneShape pointA, int radius) {
        this.pointA = pointA;
        this.radius = radius;
    }

    public PlaneShape getPointA() {
        return pointA;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "pointA " + pointA +
                ", radius = " + radius +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea();
    }
}
