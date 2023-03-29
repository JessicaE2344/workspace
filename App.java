
import java.util.Scanner;

import calculator.Calculator;


public class App {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cont = true;

        while (cont) {

            double num1 = getDouble("Enter a double");
            double num2 = getDouble("Enter the second double");
            // while (cont) {
            Calculator calculator = new Calculator();
            // double result = calculator.add(num1, num2);

            String question = getString(
                    "Which operation would  you like to perform : add, subtract, multiply, divide?");

            if (question.equals("add")) {
                System.out.println(calculator.add(num1, num2));
            }
            if (question.equals("subtract")) {
                System.out.println(calculator.subtract(num1, num2));
            }
            {
                if (question.equals("multiply")) {
                    System.out.println(calculator.multiply(num1, num2));
                }
            }
            {
                if (question.equals("divide")) {
                    if (num2 == 0) {
                        System.out.println("0 not accpeted");
                    }
                    System.out.println(calculator.divide(num1, num2));
                }
            }
            {
                if (question.equals("exit")) {
                    System.out.println("Exit");
                    cont = false;
                }
            }
        }

    }
    // System.out.println(result);

    // System.out.println(calculator.subtract(num1, num2));
    // System.out.println(calculator.multiply(num1, num2));
    // System.out.println(calculator.divide(num1, num2));

    // String answer = getString("Do you wish to continue?");
    // System.out.println(answer);
    // if (answer.equals("y")) {
    // cont = true;
    // } else {
    // System.out.println("Bye");
    // cont = false;
    // }
    // }

    private static String getString(String prompt) {
        System.out.println(prompt);
        String result = scanner.next();
        return result;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double result = scanner.nextDouble();
        return result;
    }
}
