public class Main {

    public static void main(String[] args) {

        System.out.println("task1");
        Circul abc = new Circul(3.25f);
        System.out.println(abc.area());
        System.out.println();

        System.out.println("task2");
        NumberOfObjects a1 = new NumberOfObjects();
        NumberOfObjects a2 = new NumberOfObjects();
        NumberOfObjects a3 = new NumberOfObjects();
        NumberOfObjects a4 = new NumberOfObjects();
        NumberOfObjects a5 = new NumberOfObjects();
        NumberOfObjects a6 = new NumberOfObjects();
        NumberOfObjects a7 = new NumberOfObjects();
        NumberOfObjects a8 = new NumberOfObjects();
        System.out.println(NumberOfObjects.sum);
        System.out.println();

        System.out.println("task3");
        Cars bmw = new Cars(200);
        bmw.setSpeed(100);
        System.out.println(bmw);
        bmw.startTheEngine();
        bmw.setSpeed(65);
        System.out.println(bmw);
        bmw.setGear(5);
        System.out.println(bmw);
        System.out.println();

        System.out.println("task4");
        Fractions f1 = new Fractions(5, (short) 20);
        Fractions f2 = new Fractions(2, (short) 15);
        System.out.println(f1 + " + " + f2 + " = " + f1.addition(f2).toString());
        System.out.println(f1 + " - " + f2 + " = " + f1.subtraction(f2).toString());
        System.out.println(f1 + " * " + f2 + " = " + f1.multiplication(f2).toString());
        System.out.println(f1 + " / " + f2 + " = " + f1.division(f2).toString());
        System.out.println();

        System.out.println("task5");
        Money my = new Money(10L, (byte) 90);
        Money friends = new Money(15L, (byte) 40);

        System.out.println(my.addition(friends));
        System.out.println(my.subtraction(friends));
        System.out.println(my.multiplicationMoney(friends));
        System.out.println(my.divisionMoney(friends));
        System.out.println(my.multiplication(2.5));
        System.out.println(my.division(2));
        System.out.println(my.more(friends));
        my = my.addition(new Money(4L, (byte) 50));
        System.out.println(my.equal(friends));

    }
}














