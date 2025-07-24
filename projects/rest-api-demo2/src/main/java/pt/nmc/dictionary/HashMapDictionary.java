package pt.nmc.dictionary;

import pt.nmc.dictionary.exceptions.WordNotFoundException;

import java.util.HashMap;
import java.util.Map;

public final class HashMapDictionary<K, V> implements Dictionary<K, V> {

    private final Map<K, V> map = new HashMap<>();

    public void add(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) throws WordNotFoundException {
        throwExceptionIfNotExists(key);
        return map.get(key);
    }

    public void remove(K key) throws WordNotFoundException {
        throwExceptionIfNotExists(key);
        map.remove(key);
    }

    private void throwExceptionIfNotExists(K key) throws WordNotFoundException {
        if(!map.containsKey(key)){
            throw new WordNotFoundException("key does not exists");
        }
    }
}
