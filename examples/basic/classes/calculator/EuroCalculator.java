package classes.calculator;

public enum EuroCalculator {

    ADD("€", "+",
            (a, b) -> a +b ),
    SUBTRACT("€", "-",
            (a, b) -> a - b),
    MULTIPLY("€","*",
            (a, b) -> a * b),
    DIVIDE("€","/",
            (a, b) -> a / b);
    private final String currency;
    private final String symbol;
    private final IOperation operation;

    EuroCalculator(String currency, String symbol, IOperation operation) {
        this.symbol = symbol;
        this.operation = operation;
        this.currency = currency;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getCurrency(){
        return currency;
    }

    public String getCurrencyDescription(){
        return "Euro";
    }

    public double calculate(double a, double b ){
        return operation.execute(a, b);
    }

    public static EuroCalculator createFrom(String externalSymbol) {
        for (EuroCalculator euroCalculator :
                values()) {

            if (isEquals(euroCalculator.getSymbol(), externalSymbol)) {
                return euroCalculator;
            }
        }
        return null;
    }

    private static boolean isEquals(String symbol, String externalSymbol) {
        return externalSymbol.compareToIgnoreCase(symbol) == 0;
    }
}
