package methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Methods extends Object{

    public Methods() {
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        double[] ageArray = {26, 20, 55, 60, 80};
        double[] ageArray2 = {26, 20, 45, 30, 70};
        int five = 5;
        //printMessage("The first average is ", calculateAverage(ageArray));
        //printMessage("The second average is ", calculateAverage(ageArray2));
        //printMessage("The sum is ", sum(1, 2, 3, 4 ,5, 100, five));
        //System.out.println("Found " + find(0, 2));
        //printMessage("Found ", );
        Methods methodInstance = new Methods();



        var methodString = args.getClass().getMethods();

        // Reflection
        for (var method :
                methodInstance.getClass().getMethods()) {

            System.out.println("Method name: " + method.getName());
            System.out.println("Method return: " + method.getReturnType());
            System.out.println("Method parameters number: " + method.getParameterCount());

            for (var parameterType:
            method.getParameterTypes()) {
                System.out.println("Method parameter type: " + parameterType.getTypeName());
            }

            if(method.getName().compareToIgnoreCase("toString") == 0){
                executeOperation(methodInstance, method);
            }
            System.out.println("########################################");

        }

    }

    // Execute an operation
    public static void executeOperation(Object instance, Method method) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Method execution: " +
                method.invoke(instance));
    }

    public static boolean find(int initialValue, int finalValue) {
        System.out.println("######### find #########");
        System.out.println("initialValue -> " + initialValue);
        if(initialValue < finalValue){
            return find(++initialValue, finalValue);
        }
        return initialValue == finalValue;
    }

    private static int sum(int... numbers) {
        int total = 0;
        for (var number :
                Arrays.stream(numbers).
                        toArray()
        ) {
            total += number; // == total = total + 1;
        }

        return total;
    }

    private static double calculateAverage(double[] ageArray) {
        double average;
        double sum = 0;

        for (double age :
                Arrays.stream(ageArray).toArray()) {
            sum += age;
        }

        average = sum / ageArray.length;
        return average;
    }

    private static void printMessage(int parameter) {
        printMessage(null, parameter);
    }

    private static void printMessage(String text, double parameter) {
        printMessage(text, String.valueOf(parameter));
    }

    private static void printMessage(String text, String parameter) {
        if (text == null) {
            return;
        }

        System.out.println(text + parameter);
    }

    private static int readInteger(String text) {
        if (text == null) {
            return -1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        int intValue = scanner.nextInt();
        scanner.close();
        return intValue;
    }
}
