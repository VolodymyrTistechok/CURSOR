package shape_classes;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import vertices.vertices3D;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected List<vertices3D> vertices;
}
