package runner;

import collections.*;

public class CollectionRunner {
    public static void main(String[] args) {
        // Testing HashMap
        HashMapClass<String, String> myHashMap = new HashMapClass<>();
        myHashMap.initialize();


        // Testing HashSet
        HashSetClass<String> myHashSet = new HashSetClass<>();
        myHashSet.initialize();


        // Testing MyString
        StringClass myString = new StringClass("hello");
        myString.initialize("hello");


        // Testing Array
        ArrayClass myArray = new ArrayClass(5);
        myArray.initialize(5);


        // Testing List
        ListClass<String> myList = new ListClass<>();
        myList.initialize();

    }
}