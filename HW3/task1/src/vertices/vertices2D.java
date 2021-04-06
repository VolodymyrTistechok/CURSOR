package vertices;

public class vertices2D {
    public double x;
    public double y;

    public vertices2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double getDistanceBetweenTwo2DVertices(vertices2D firstVertex, vertices2D secondVertex) {
        return Math.sqrt(Math.pow(firstVertex.x - secondVertex.x, 2) + Math.pow(firstVertex.y - secondVertex.y, 2));
    }
    @Override
    public String toString() {
        return "(x=" + x + ", y=" + y + ")";
    }
}
