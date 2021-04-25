package Task2;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int firstNumber=0;
        int secondNumber=0;
        double result;

        while (true) {
            if (!flag) {
                System.out.println("Division");
                System.out.print("Enter the first Number(only integer): ");
                firstNumber = scanner.nextInt();
                System.out.print("Enter the second Number(only integer): ");
                secondNumber = scanner.nextInt();
            }
            try {
                if (secondNumber == 0) {
                    throw new ArithmeticException("You can't divide by zero");
                } else {
                    result = (double) firstNumber / secondNumber;
                    System.out.printf("Division result: %.4f%n", result);
                    flag = false;
                    System.out.println("-".repeat(30));
                }

            } catch (ArithmeticException exception) {
                System.out.print(exception.getMessage() + "\n" + "Enter the second Number(only integer): ");
                secondNumber = scanner.nextInt();
                flag = true;
            }
        }

    }

}

