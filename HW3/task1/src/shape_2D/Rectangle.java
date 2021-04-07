package shape_2D;

import shape_classes.PlaneShape;
import vertices.Vertices2D;

import java.util.ArrayList;

public class Rectangle extends PlaneShape {
    private final double width;
    private final double height;

    public Rectangle(Vertices2D pointA, int width, int height) {
        vertices = new ArrayList<>();
        vertices.add(pointA);
        this.width = width;
        this.height = height;
    }

    public Vertices2D getPointA() {
        return vertices.get(0);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "pointA " + vertices.get(0) +
                ", width = " + width +
                ", height = " + height +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea();

    }
}
