package practice;

import java.util.HashMap;

public class StringMethod {
    // Method to find the frequency of a character using built-in functions
    public int findFrequency(String input, char character) {
        return (int) input.chars().filter(ch -> ch == character).count();
    }

    // Method to check if a character is present
    public boolean isCharacterPresent(String input, char character) {
        return input.indexOf(character) >= 0;
    }

    // Method to check if a substring is present
    public boolean isSubstringPresent(String input, String substring) {
        return input.contains(substring);
    }

    // Find the frequency of each character in a string
    public HashMap<Character, Integer> findCharacterFrequency(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }


    // Find the index of a character in a string
    public int findCharacterIndex(String input, char character) {
        return input.indexOf(character);
    }

    // Convert an integer to a string
    public String convertIntegerToString(int number) {
        return Integer.toString(number);
    }


}
