package practice;

import java.util.Arrays;

public class ArrayMethod {
    // Method to check if an element is present in an array
    public boolean isElementPresent(int[] array, int element) {
        return Arrays.stream(array).anyMatch(e -> e == element);
    }

    // Method to find the frequency of an element in an array
    public long findFrequency(int[] array, int element) {
        return Arrays.stream(array).filter(e -> e == element).count();
    }

    //    Print all the element of an array
    public void printArrayElements(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    // Find the index of an element in an array
    public int findElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // Return -1 if element is not found
    }
}
