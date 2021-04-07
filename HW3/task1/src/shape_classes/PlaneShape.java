package shape_classes;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import vertices.Vertices2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected List<Vertices2D> vertices;
}
