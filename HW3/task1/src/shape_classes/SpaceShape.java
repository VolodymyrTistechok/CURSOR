package shape_classes;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import vertices.Vertices3D;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected List<Vertices3D> vertices;
}
