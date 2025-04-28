package runner;

import practice.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MethodRunner {
    public static void main(String[] args) {
        // Create objects for utility classes
        StringMethod stringMethod = new StringMethod();
        ArrayMethod arrayMethod = new ArrayMethod();

        // Testing StringMethod
        String testString = "hello world";
        char testChar = 'o';
        String testSubstring = "world";

        System.out.println("Frequency of '" + testChar + "' in \"" + testString + "\": " +
                stringMethod.findFrequency(testString, testChar));
        System.out.println("Is character '" + testChar + "' present: " +
                stringMethod.isCharacterPresent(testString, testChar));
        System.out.println("Is substring \"" + testSubstring + "\" present: " +
                stringMethod.isSubstringPresent(testString, testSubstring));
        stringMethod.findCharacterFrequency("Manish");
        stringMethod.convertIntegerToString(123);
        // Testing ArrayMethod
        int[] testArray = {1, 2, 3, 4, 2, 5, 2};
        int testElement = 2;

        System.out.println("Frequency of " + testElement + " in array: " +
                arrayMethod.findFrequency(testArray, testElement));

        System.out.println("Is element " + testElement + " present: " +
                arrayMethod.isElementPresent(testArray, testElement));

        arrayMethod.printArrayElements(testArray);

        arrayMethod.findElementIndex(testArray, 4);

        // HashSetMethod demonstration
        HashSetMethod hashSetMethod = new HashSetMethod();
        HashSet<String> hashSet = new HashSet<>();

        hashSetMethod.addElement(hashSet, "Apple");
        hashSetMethod.addElement(hashSet, "Banana");
        System.out.println("HashSet contains 'Apple': " + hashSetMethod.isElementPresent(hashSet, "Apple"));
        System.out.println("Removing 'Apple': " + hashSetMethod.removeElement(hashSet, "Apple"));
        System.out.println("HashSet contains 'Apple' after removal: " + hashSetMethod.isElementPresent(hashSet, "Apple"));
        hashSetMethod.printAllElements(hashSet);
        // HashMapMethod demonstration
        HashMapMethod hashMapMethod = new HashMapMethod();
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMapMethod.addEntry(hashMap, "John", 30);
        hashMapMethod.addEntry(hashMap, "Jane", 25);
        System.out.println("Value for 'John': " + hashMapMethod.getValue(hashMap, "John"));
        System.out.println("Is 'Jane' a key: " + hashMapMethod.isKeyPresent(hashMap, "Jane"));
        hashMapMethod.printAllEntries(hashMap);

        // ListMethod demonstration
        ListMethod listMethod = new ListMethod();
        List<String> list = new ArrayList<>();

        listMethod.addElement(list, "Dog");
        listMethod.addElement(list, "Cat");
        System.out.println("List contains 'Dog': " + listMethod.isElementPresent(list, "Dog"));
        System.out.println("Removing 'Dog': " + listMethod.removeElement(list, "Dog"));
        System.out.println("List contains 'Dog' after removal: " + listMethod.isElementPresent(list, "Dog"));
        listMethod.printAllElements(list);
        listMethod.findElementIndex(list, "Dog");
    }

}
