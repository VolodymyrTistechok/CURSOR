package shape_2D;

import shape_classes.PlaneShape;
import vertices.vertices2D;

import java.util.ArrayList;

public class Triangle extends PlaneShape  {
    private final double disAB;
    private final double disBC;
    private final double disCA;

    public Triangle(vertices2D pointA, vertices2D pointB, vertices2D pointC) {
        vertices = new ArrayList<>();
        vertices.add(pointA);
        vertices.add(pointB);
        vertices.add(pointC);
        disAB = vertices2D.getDistanceBetweenTwo2DVertices(pointA, pointB);
        disBC = vertices2D.getDistanceBetweenTwo2DVertices(pointB, pointC);
        disCA = vertices2D.getDistanceBetweenTwo2DVertices(pointC, pointA);
    }

    public vertices2D getPointA() {
        return vertices.get(0);
    }

    public vertices2D getPointB() {
        return vertices.get(1);
    }

    public vertices2D getPointC() {
        return vertices.get(2);
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
                "pointA " + vertices.get(0) +
                ", pointB " + vertices.get(1) +
                ", pointC " + vertices.get(2) +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea();
    }
}
