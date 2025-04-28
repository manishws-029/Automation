package collections;

public class HashMapClass<K, V> {
    private java.util.HashMap<K, V> map;

//    made a constructor
        public HashMapClass() {
        map = new java.util.HashMap<>();
    }

    public void initialize() {
        map = new java.util.HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }


}