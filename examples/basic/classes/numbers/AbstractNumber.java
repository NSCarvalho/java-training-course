package classes.numbers;

import classes.numbers.utils.NumberUtils;

public abstract class AbstractNumber implements Number{

    private final Double value;

    public AbstractNumber(Double value) {
        this.value = value;
    }
    public abstract String getClassName();

    @Override
    public boolean isEven() {
        return false;
    }

    @Override
    public boolean isNegative() {
        return false;
    }

    public int getNumberAsInt() {
        return NumberUtils.convertToInt(this.value);
    }

    public double getNumberAsDouble() {
        return value;
    }

    public boolean isEquals(BigNumber bigNumber) {
        return bigNumber.getNumberAsDouble() == this.value;
    }
}
