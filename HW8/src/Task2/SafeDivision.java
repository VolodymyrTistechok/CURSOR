package Task2;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        while (true) {
            System.out.println("Division");
            System.out.print("Enter the first Number(only integer): ");
            firstNumber = setValue(scanner.next(), "Enter the first Number(only integer): ");
            System.out.print("Enter the second Number(only integer): ");
            secondNumber = setValue(scanner.next(), "Enter the second Number(only integer): ");
            division(firstNumber, secondNumber);
        }

    }

    static int setValue(String str, String message) {
        Scanner sc = new Scanner(System.in);
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.print(message);
            number = setValue(sc.next(), message);
        }
        return number;
    }

    static void division(int a, int b) {
        Scanner sc = new Scanner(System.in);
        try {
            if (b == 0) {
                throw new ArithmeticException("You can't divide by zero");
            } else {
                System.out.printf("Division result: %.4f%n", (double) a / b);
                System.out.println("-".repeat(30));
            }

        } catch (ArithmeticException exception) {
            System.out.print(exception.getMessage() + "\n" + "Enter the second Number(only integer): ");
            b = setValue(sc.next(), "Enter the second Number(only integer): ");
            division(a, b);
        }
    }

}

