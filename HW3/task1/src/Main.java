import shape_2D.Circle;
import shape_2D.Rectangle;
import shape_2D.Triangle;
import shape_3D.Cuboid;
import shape_3D.Sphere;
import shape_3D.SquarePyramid;
import shape_classes.Shape;
import vertices.Vertices2D;
import vertices.Vertices3D;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];
        shapes[0] = new Triangle(new Vertices2D(1, 5), new Vertices2D(3, 8), new Vertices2D(4, 6));
        shapes[1] = new Rectangle(new Vertices2D(4, 6), 5, 7);
        shapes[2] = new Circle(new Vertices2D(5, 6), 14);
        shapes[3] = new SquarePyramid(new Vertices3D(1, 2, 3), 4, 6);
        shapes[4] = new Cuboid(new Vertices3D(4, 5, 6), 47, 56, 54);
        shapes[5] = new Sphere(new Vertices3D(4, 5, 6), 23);

        for (Shape i : shapes) {
            System.out.println(i);
        }
    }
}
