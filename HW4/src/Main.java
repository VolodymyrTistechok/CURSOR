public class Main {
    public static void main(String[] args) {

        MyList <Double> l = new MyList<>();
        l.addElementInTheEnd(22.1);
        l.addElementInTheEnd(22.9);
        l.addElementInTheEnd(22.8);
        l.addElementInTheEnd(22.3);
        l.addElementInTheEnd(22.2);
        l.showArray();
        l.removeElementInTheEnd();
        System.out.println(l.smallest());
        System.out.println(l.largest());
        l.showArray();

        MyList <String> arS = new MyList<>();
        arS.addElementInTheEnd("Michael");
        arS.addElementInTheEnd("Annie");
        arS.addElementInTheEnd("Anna");
        arS.addElementInTheEnd("Cameron");
        arS.addElementInTheEnd("Peter");
        arS.addElementInTheEnd("Jack");
        arS.showArray();
        System.out.println(arS.smallest());
        System.out.println(arS.largest());


    }
}
