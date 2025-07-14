package classes.numbers.currency;

import classes.numbers.AbstractNumber;
import classes.numbers.SmallNumber;

public class Currency extends AbstractNumber {
    private String currencyCode;
    private String currencyDescription;

    public Currency(Double value) {
        super(value);
    }

    public Currency(Double value, String currencyCode, String currencyDescription) {
        super(value);
        this.currencyCode = currencyCode;
        this.currencyDescription = currencyDescription;
    }

    @Override
    public boolean isCurrency() {
        return true;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyDescription() {
        return currencyDescription;
    }

    @Override
    public String getClassName() {
        return SmallNumber.class.toString();
    }
}
