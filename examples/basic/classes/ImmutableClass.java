package classes;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    // fields are final
    final private Double value;
    final private List<Double> doubleList = new ArrayList<>();

    public ImmutableClass(Double value, List<Double> doubleList) {
        this.value = Double.valueOf(value); // Alloc new memory

        // Copy list elements to other list
        doubleList.forEach(elem ->
                doubleList.add(elem)
        );
        //this.doubleList = doubleList;
    }

    public Double getValue() {
        return value;
    }

    public List<Double> getDoubleList() {
        List<Double> doubleListCopy = new ArrayList<>();
        // Copy list elements to other list
        doubleList.forEach(elem ->
                doubleListCopy.add(elem)
        );
        return doubleListCopy;
    }
}
