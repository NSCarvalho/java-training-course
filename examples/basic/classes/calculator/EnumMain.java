package classes.calculator;

public class EnumMain {

    public static void main(String[] args) {

        printCalculationResult(EuroCalculator.createFrom("-"));
        printCalculationResult(EuroCalculator.createFrom("+"));
        printCalculationResult(EuroCalculator.createFrom("/"));
        printCalculationResult(EuroCalculator.createFrom("*"));

    }

    private static void printCalculationResult(EuroCalculator calculator) {

        System.out.println(calculator.getSymbol() + ": " +
                calculator
                        .calculate(1, 3) + " " + calculator.getCurrency());
    }
}
