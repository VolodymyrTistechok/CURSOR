public class ArmorCar extends CarDecorator{

    public ArmorCar(Car car) {
        super(car);
    }

    public String properties(){
        return " that is armored and floating";
    }

    @Override
    public String info() {
        return super.info()+properties() ;
    }


}
