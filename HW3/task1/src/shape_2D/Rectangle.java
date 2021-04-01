package shape_2D;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import shape_classes.PlaneShape;
import shape_classes.Shape;

public class Rectangle extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private final PlaneShape pointA;
    private final int width;
    private final int height;

    public Rectangle(PlaneShape pointA, int width, int height) {
        this.pointA = pointA;
        this.width = width;
        this.height = height;
    }

    public PlaneShape getPointA() {
        return pointA;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
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
                "pointA " + pointA +
                ", width = " + width +
                ", height = " + height +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea();

    }
}
