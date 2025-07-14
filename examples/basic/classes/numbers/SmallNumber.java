package classes.numbers;

public final class SmallNumber extends AbstractNumber {

    public SmallNumber(Double smallNumber) {
        super(smallNumber);
    }

    @Override
    public String getClassName() {
        return SmallNumber.class.toString();
    }
}
