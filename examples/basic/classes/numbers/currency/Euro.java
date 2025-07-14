package classes.numbers.currency;

public class Euro extends Currency {

    public Euro(Double value) {
        super(value, "€", "Euro");
    }

    public static Euro convertFrom(Currency otherCurrency){
        return new Euro(1.0);
    }
}
