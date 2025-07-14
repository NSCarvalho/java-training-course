package classes.numbers;

public interface Number {

    boolean isEven();

    boolean isNegative();

    default boolean isCurrency(){
        return false;
    }
}
