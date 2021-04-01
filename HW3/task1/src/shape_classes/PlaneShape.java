package shape_classes;

public class PlaneShape extends Shape {
    int x;
    int y;

    public PlaneShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistanceBetweenTwo2DVertices(PlaneShape firstVertex, PlaneShape secondVertex) {
        return Math.sqrt(Math.pow(firstVertex.x - secondVertex.x, 2) + Math.pow(firstVertex.y - secondVertex.y, 2));
    }

    @Override
    public String toString() {
        return "(x=" + x + ", y=" + y + ")";
    }
}
