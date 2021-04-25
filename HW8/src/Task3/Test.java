package Task3;

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println();
            someMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("hello");
    }

    public static void someMethod() throws Exception {
        someMethod2();
    }
}

