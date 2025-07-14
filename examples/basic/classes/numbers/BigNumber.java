package classes.numbers;

public final class BigNumber extends AbstractNumber {

    public BigNumber(Double bigNumbers) {
        super(bigNumbers);
    }

    @Override
    public String getClassName() {
        return SmallNumber.class.toString();
    }
}
