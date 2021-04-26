package classes;

public class CarBMW implements Car {
    private String name;
    private String color;

    public CarBMW(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String info() {
        return "It is a simple car";
    }
}
