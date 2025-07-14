package classes.numbers.utils;

public final class NumberUtils {

    private NumberUtils() {
    }

    public static int convertToInt(double number){
        return (int) number;
    }

    public static boolean isNegative(double number){
        return number < 0;
    }
}
