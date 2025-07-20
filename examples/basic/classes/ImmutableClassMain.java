package classes;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClassMain {

    public static void main(String[] args) {
        Double value = Double.valueOf("10"); //   double valuep = "10";
        Double valueRef = value;

        Double valueNew = Double.valueOf("10");

        List<Double> doubleList = new ArrayList<>();

        System.out.println("value = " + value);
        System.out.println("valuerRef = " + valueRef);
        System.out.println("valueNew = " + valueNew);

        ImmutableClass immutableClass = new ImmutableClass(value, doubleList);
        // immutableClass.setValue(Double.valueOf("11")); NOT ALLOWED
        printValues(immutableClass);

        doubleList.add(10.0);
        immutableClass.getDoubleList().add(11.0);
        printValues(immutableClass);


    }

    private static void printValues(ImmutableClass immutableClass) {
        System.out.println("immutableClass: value: " + immutableClass.getValue());
        for (var doubleValue:
        immutableClass.getDoubleList()) {
            System.out.println("immutableClass: DoubleList: " + doubleValue);
        }
    }
}
