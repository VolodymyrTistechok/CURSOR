public class AmbulanceCar extends CarDecorator{

    public AmbulanceCar(Car car) {
        super(car);
    }

    public String properties(){
        return " with a siren";
    }

    @Override
    public String info() {
        return super.info()+properties();
    }


}
