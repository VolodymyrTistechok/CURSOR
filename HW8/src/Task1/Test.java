package Task1;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        System.out.println("Task1");
        try {
            throw new ExceptionA("message from the ExceptionA");
        } catch (ExceptionA exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new ExceptionB("message from the ExceptionB");
        } catch (ExceptionB exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new NullPointerException("message from the NullPointerException");
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new IOException("message from the IOException");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
