public class Main {
    public static void main(String[] args) {

        MyList<Integer> l = new MyList<Integer>();
        l.addElementInTheEnd(22);
        l.addElementInTheEnd(23);
        l.addElementInTheEnd(4);
        l.addElementInTheEnd(5);
        l.addElementInTheEnd(6);
        l.showArray();
        l.removeElementInTheEnd();
        System.out.println(l.smallest());
        System.out.println(l.largest());
        l.showArray();

//        MyList <String> arS = new MyList<>();
//        arS.addElementInTheEnd("Michael");
//        arS.addElementInTheEnd("Annie");
//        arS.addElementInTheEnd("Anna");
//        arS.addElementInTheEnd("Cameron");
//        arS.addElementInTheEnd("Peter");
//        arS.addElementInTheEnd("Jack");
//        arS.showArray();
//        System.out.println(arS.smallest());
//        System.out.println(arS.largest());


    }
}
