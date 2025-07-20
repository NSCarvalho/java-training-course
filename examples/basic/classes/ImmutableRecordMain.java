package classes;

import java.util.ArrayList;
import java.util.List;

public class ImmutableRecordMain {

    public static void main(String[] args) {
        Double value = Double.valueOf("10"); //   double valuep = "10";
        List<Double> doubleList = new ArrayList<>();


        ImmutableRecordClass immutableRecordClass = new ImmutableRecordClass(value, doubleList);
        // immutableClass.setValue(Double.valueOf("11")); NOT ALLOWED
        printValues(immutableRecordClass);

        doubleList.add(10.0);
        immutableRecordClass.doubleList().add(11.0);
        printValues(immutableRecordClass);


    }

    private static void printValues(ImmutableRecordClass immutableRecordClass) {
        System.out.println("immutableClass: value: " + immutableRecordClass.value());
        for (var doubleValue:
        immutableRecordClass.doubleList()) {
            System.out.println("immutableClass: DoubleList: " + doubleValue);
        }
    }
}
