package inputs;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        byte numChildren;
        short yearsOfExp;
        int age;
        long NIF;
        float heightInM;
        float weightInKg;
        double monthlySalary;
        boolean employed;
        char favLetter;

        System.out.print("How many children do you have: ");
        numChildren = scanner.nextByte();

        System.out.print("How many years of experience do you have: ");
        yearsOfExp = scanner.nextShort();

        System.out.print("What is your age: ");
        age = scanner.nextInt();

        System.out.print("What is your NIF: ");
        NIF = scanner.nextLong();

        System.out.print("What is your height (in meters): ");
        heightInM = scanner.nextFloat();

        System.out.print("What is your weight (in Kg): ");
        weightInKg = scanner.nextFloat();

        System.out.print("Your mounthly salary is: ");
        monthlySalary = scanner.nextDouble();

        System.out.print("Are you employed? (true or false): ");
        employed = scanner.nextBoolean();

        System.out.print("What is your favourite letter");
        favLetter = scanner.next().charAt(0);

        System.out.println("You have " + numChildren + " children, " + yearsOfExp + " years of experience. You are " + age
                + " years old, your NIF is " + NIF + ", and your height and weight are " + heightInM + " meters and "
                + weightInKg + " Kg. Are you currently employed? " + employed + "And your favourite letter is "
                + favLetter + "Your current monthly salary is " + monthlySalary);

        scanner.close();
    }
}
