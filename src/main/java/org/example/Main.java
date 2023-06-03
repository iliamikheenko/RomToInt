package org.example;

import java.util.HashMap;

public class Main {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbolValues = new HashMap<>();
        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = symbolValues.get(s.charAt(i));

            if (i < s.length() - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                result -= value;
            }
            else {
                result += value;
            }
        }
        return result;
    }
}

