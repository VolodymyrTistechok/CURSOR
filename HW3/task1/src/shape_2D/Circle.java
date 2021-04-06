package shape_2D;

import shape_classes.PlaneShape;
import vertices.vertices2D;

import java.util.ArrayList;

public class Circle extends PlaneShape   {
    private final double radius;

    public Circle(vertices2D pointA, int radius) {
        vertices = new ArrayList<>();
        vertices.add(pointA);
        this.radius = radius;
    }

    public vertices2D getPointA() {
        return vertices.get(0);
    }

    public double getRadius() {
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
                "pointA " + vertices.get(0) +
                ", radius = " + radius +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea();
    }
}
