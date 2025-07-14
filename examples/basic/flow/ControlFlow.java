package flow;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        cycleFor();
        whileAndDoWhile();
        ifAndSwitch();
    }

    private static void cycleFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a word");
        String word = scanner.next();
        int size = word.length();

        for (int index = 0; index <= size; index++) {

            if (word.charAt(index) == 'A' ||
                    word.charAt(index) == 'a') {
                System.out.println("Word " + word + " contains letter A or a");
                break;
            }
        }

        for (char letter : word.toCharArray()) {
            if (letter == 'A' ||
                    letter == 'a') {
                System.out.println("Word " + word + " contains letter A or a");
                break;
            }
        }

        for (char operator : "?*/-+".toCharArray()) {

            if (operator == '?') {
                continue;
            }

            switch (operator) {
                case '*' -> System.out.println("Selected operation: multiplication (*)");
                case '+' -> System.out.println("Selected operation: addition (+)");
                case '-' -> System.out.println("Selected operation: subtraction (-)");
                case '/' -> System.out.println("Selected operation: division (/)");
                default -> System.out.println("Unsupported operation");
            }

            // other instructions
        }
    }

    private static void whileAndDoWhile() {
        Scanner scanner = new Scanner(System.in);


        // While
        // System.out.println("Introduce odd number");
        // Integer number = scanner.nextInt();
        /*while (number % 2 != 0){
            System.out.println("Introduce new number");
            number = scanner.nextInt();
        }*/

        Integer number;
        do {

            System.out.println("Introduce odd number");
            number = scanner.nextInt();

        } while (number % 2 != 0);

        scanner.close();
    }

    private static void ifAndSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation? (+, -, *, /)");
        String operator = scanner.next();
        scanner.close();

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


        // Switch old version
        switch (operator) {
            case "*":
                System.out.println("Selected operation: multiplication (*)");
                break;
            case "+":
                System.out.println("Selected operation: addition (+)");
                break;
            case "-":
                System.out.println("Selected operation: subtraction (-)");
                break;
            case "/":
                System.out.println("Selected operation: division (/)");
                break;
            default:
                System.out.println("Unsupported operation");
        }

        // Switch new version
        switch (operator) {
            case "*" -> System.out.println("Selected operation: multiplication (*)");
            case "+" -> System.out.println("Selected operation: addition (+)");
            case "-" -> System.out.println("Selected operation: subtraction (-)");
            case "/" -> System.out.println("Selected operation: division (/)");
            default -> System.out.println("Unsupported operation");
        }
    }
}