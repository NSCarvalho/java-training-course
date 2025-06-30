package flow;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which operation? (+, -, *, /)");
        String operator = scanner.next();

        // IF
        if (operator.equals("*")) {
            System.out.println("Selected operation: multiplication (*)");
        } else if (operator.equals("+")) {
            System.out.println("Selected operation: addition (+)");
        } else if (operator.equals("-")) {
            System.out.println("Selected operation: subtraction (-)");
        } else if (operator.equals("/")) {
            System.out.println("Selected operation: division (/)");
        } else {
            System.out.println("Unsupported operation");
        }

        scanner.close();
    }
}