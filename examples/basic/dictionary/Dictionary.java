package dictionary;

import dictionary.exceptions.WordNotFoundException;

public interface Dictionary<K, V> {

    void add(K key, V value);

    V get(K key) throws WordNotFoundException;

    void remove(K key) throws WordNotFoundException;
}
