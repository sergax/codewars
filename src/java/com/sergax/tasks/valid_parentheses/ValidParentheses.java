package com.sergax.tasks.valid_parentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * by Aksenchenko Serhii on 21.04.2022
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        List list = new ArrayList<>();
        char[] arrayChar = s.toCharArray();

        if (s.length() > 10_000) return false;

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == '(' || arrayChar[i] == '{' || arrayChar[i] == '[') {
                list.add(arrayChar[i]);
            } else {
                if (list.isEmpty()) {
                    return false;
                }
                if (arrayChar[i] == ')' && !list.contains('(')) {
                    return false;
                }
                if (arrayChar[i] == '}' && !list.contains('{')) {
                    return false;
                }
                if (arrayChar[i] == ']' && !list.contains('['))
                    return false;
            }
        }
        return list.isEmpty();
    }
}

