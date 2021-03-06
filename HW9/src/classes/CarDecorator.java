package classes;

public class CarDecorator implements Car{
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String info() {
        return car.info();
    }
}
