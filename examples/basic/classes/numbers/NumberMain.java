package classes.numbers;

import classes.numbers.currency.Currency;
import classes.numbers.currency.Dollar;
import classes.numbers.currency.Euro;
import classes.numbers.utils.NumberUtils;

import java.util.Scanner;

public class NumberMain {

    public static void main(String[] args) {
        //class6();

        Currency currency =
                new Currency(10.50, "€", "Euro");

        Euro bikePrice = new Euro(10.50);

        Dollar salary = new Dollar(10.0);

        Euro salaryInEuro = Euro.convertFrom(salary);

        BigNumber bigNumber = new BigNumber(500000000.0);
        SmallNumber smallNumber = new SmallNumber(50.9);

        //AbstractNumber abstractNumber = new AbstractNumber();
        smallNumber.getClassName();
        bigNumber.getClassName();
        currency.getClassName();

    }

    private static void class6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a big number");
        double number = scanner.nextDouble();

        System.out.println("Give me a big number");
        double number1 = scanner.nextDouble();

        BigNumber bigNumber = new BigNumber(1.0);
        BigNumber bigNumber2 = new BigNumber(0.0);

        System.out.println("Is this number negative? "  + bigNumber.isNegative());
        System.out.println("This number as int: "  + bigNumber.getNumberAsInt());
        System.out.println("Equals? " + bigNumber.isEquals(bigNumber2));

        //var numberUtils = new NumberUtils();
        //numberUtils.toString2(1);

        // NumberUtils.toString2();

        System.out.println("Is this number negative? "  + NumberUtils.isNegative(number));
        System.out.println("This number as int: "  + NumberUtils.convertToInt(number));
    }
}
