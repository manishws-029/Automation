package practice;

import java.util.HashSet;

public class HashSetMethod {
    public boolean isElementPresent(HashSet<String> set, String element) {
        return set.contains(element);
    }

    // Add an element to the HashSet
    public void addElement(HashSet<String> set, String element) {
        set.add(element);
    }

    // Remove an element from the HashSet
    public boolean removeElement(HashSet<String> set, String element) {
        return set.remove(element);
    }

    // Print all elements in the HashSet
    public void printAllElements(HashSet<String> set) {
        if (set.isEmpty()) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("Elements in the HashSet:");
            set.forEach(System.out::println);
        }
    }
}
