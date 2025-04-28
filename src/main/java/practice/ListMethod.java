package practice;

import java.util.List;

public class ListMethod {

    // Add an element to the list
    public void addElement(List<String> list, String element) {
        list.add(element);
    }

    // Remove an element from the list
    public boolean removeElement(List<String> list, String element) {
        return list.remove(element);
    }

    // Check if an element exists in the list
    public boolean isElementPresent(List<String> list, String element) {
        return list.contains(element);
    }
    // Print all elements in the List
    public void printAllElements(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("The List is empty.");
        } else {
            System.out.println("Elements in the List:");
            list.forEach((element) -> System.out.println(element));
        }
    }
    // Find the index of an element in a list
    public int findElementIndex(List<String> list, String element) {
        return list.indexOf(element);
    }
}
