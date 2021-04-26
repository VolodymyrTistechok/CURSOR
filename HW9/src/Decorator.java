public class Decorator {
    public static void main(String[] args) {
        Car bmw = new CarBMW("BMW","blue");
        System.out.println(bmw.info());

        Car ambulanceBMW = new AmbulanceCar(bmw);
        System.out.println(ambulanceBMW.info());

        Car armorBMW = new ArmorCar(bmw);
        System.out.println(armorBMW.info());

        Car bmw2 = new ArmorCar(new AmbulanceCar(bmw));
        System.out.println(bmw2.info());
    }
}
