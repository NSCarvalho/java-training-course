package generics;

public class NullSafe<V> {

    private V value;

    private NullSafe(V value) {
        this.value = value;
    }

    public static <V> NullSafe of(V value) {
        return new NullSafe(value);
    }

    public boolean isEmpty() {
        return value == null || value.toString().isEmpty();
    }

    public V getValue() {
        return value;
    }
}
