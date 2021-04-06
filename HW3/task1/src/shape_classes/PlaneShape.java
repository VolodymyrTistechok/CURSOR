package shape_classes;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import vertices.vertices2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected List<vertices2D> vertices;
}
