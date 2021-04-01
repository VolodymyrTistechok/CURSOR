package shape_2D;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import shape_classes.PlaneShape;
import shape_classes.Shape;
import shape_classes.SpaceShape;

public class Triangle extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private final PlaneShape pointA;
    private final PlaneShape pointB;
    private final PlaneShape pointC;
    private final double disAB;
    private final double disBC;
    private final double disCA;

    public Triangle(PlaneShape pointA, PlaneShape pointB, PlaneShape pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        disAB = SpaceShape.getDistanceBetweenTwo2DVertices(pointA, pointB);
        disBC = SpaceShape.getDistanceBetweenTwo2DVertices(pointB, pointC);
        disCA = SpaceShape.getDistanceBetweenTwo2DVertices(pointC, pointA);
    }

    public PlaneShape getPointA() {
        return pointA;
    }

    public PlaneShape getPointB() {
        return pointB;
    }

    public PlaneShape getPointC() {
        return pointC;
    }


    @Override
    public double getArea() {
        double s;
        s = getPerimeter() / 2;
        return Math.sqrt(s * (s - disAB) * (s - disBC) * (s - disCA));
    }

    @Override
    public double getPerimeter() {
        return disAB + disBC + disCA;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "pointA " + pointA +
                ", pointB " + pointB +
                ", pointC " + pointC +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea();
    }
}
