package exceptions;

import java.util.Scanner;

public class DivideByZeroDemo {

    public static void main(String[] args) {


        try {
            task1();
            task2();

        }catch (Task1Exception e){

            task1Recovery();

        }catch (CustomException e){
            taskMarkAsError();
        }

        //throw new Task3Exception("");
    }

    private static void taskMarkAsError() {
        System.out.println("Error processing request");
    }

    private static void task2() throws CustomException {
        try {
            System s = null;
            s.toString();
        }catch (Exception e){
            throw new Task2Exception(e.getMessage(), e);
        }
    }

    private static void task1Recovery() {
        System.out.println("Task 1 recovery");
    }

    private static void task1() throws CustomException {
        var scanner = new Scanner(System.in);

        System.out.println("Introduce number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Introduce number 2:");
        int number2 = scanner.nextInt();

        //int result = number1 / number2;
        try {
            calculateAndPrint(scanner, number1, number2);
        }catch (Exception e){
            throw new Task1Exception(e.getMessage(), e);
        }


        //System.out.println("Operation finished.");
    }

    private static void calculateAndPrint(Scanner scanner, int number1, int number2) {
        int result = 0;
        try {
            result = number1 / number2;

            System.out.println("The result is " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            throw e;
        } finally {
            scanner.close();
        }
    }
}
