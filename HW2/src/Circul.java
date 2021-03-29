public class Circul {

    float radius;

    public Circul(float radius) {
        this.radius = radius;
    }

    float area() {
        return (float) Math.PI * radius * radius;
    }

}
