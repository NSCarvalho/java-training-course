package classes.numbers;

public interface Number {

    void printNumber();

    boolean isEven();

    boolean isNegative();

    default boolean isCurrency(){
        return false;
    }
}
