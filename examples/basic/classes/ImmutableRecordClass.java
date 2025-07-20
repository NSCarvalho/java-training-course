package classes;

import java.util.ArrayList;
import java.util.List;

public record ImmutableRecordClass(Double value, List<Double> doubleList) {

    public ImmutableRecordClass {
        List<Double> doubleListCopy = new ArrayList<>();
        // Copy list elements to other list
        doubleList.forEach(elem ->
                doubleListCopy.add(elem)
        );
        doubleList = doubleListCopy;
    }

    @Override
    public List<Double> doubleList() {
        List<Double> doubleListCopy = new ArrayList<>();
        // Copy list elements to other list
        doubleList.forEach(elem ->
                doubleListCopy.add(elem)
        );
        return doubleListCopy;
    }
}
