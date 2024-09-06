package com.company;

import java.util.HashMap;
import java.util.Map;

public class _13_Roman_to_Integer {
    public int romanToInt(String s) {
        // Create a map to store Roman numerals and their values
        Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        int sum = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int value = dictionary.get(s.charAt(i));
            sum = (i < s.length() - 1 && value < dictionary.get(s.charAt(i + 1))) ? sum - value : sum + value;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
