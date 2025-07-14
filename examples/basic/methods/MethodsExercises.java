package methods;

import java.lang.reflect.InvocationTargetException;

public class MethodsExercises{

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
        //printArray(reverseArray(array, );

    }

    public void reverseArray(int[] array, int startIndex, int endIndex){

        System.out.println("Execute reverseArray: startIndex: " + startIndex + " endIndex: " + endIndex);
        if(startIndex >= endIndex ){
            return;
        }

        int firstElement = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = firstElement;

        reverseArray(array, startIndex+1, endIndex -1);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}