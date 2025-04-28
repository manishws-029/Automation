package practice;

import java.util.HashMap;

public class HashMapMethod {

    // Add a key-value pair to the HashMap
    public void addEntry(HashMap<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    // Get the value for a specific key
    public Integer getValue(HashMap<String, Integer> map, String key) {
        return map.get(key);
    }

    // Check if a key exists in the HashMap
    public boolean isKeyPresent(HashMap<String, Integer> map, String key) {
        return map.containsKey(key);
    }
    // Print all key-value pairs in the HashMap
    public void printAllEntries(HashMap<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("Key-Value pairs in the HashMap:");
            map.forEach((key, value) -> System.out.println(key + " : " + value));
        }
    }
}
