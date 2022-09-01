package com.sergax.tasks.kuy8_7.valid_parentheses;

import java.util.ArrayList;
import java.util.List;


/**
 * by Aksenchenko Serhii on 21.04.2022
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        char[] arrayChar = s.toCharArray();

        if (s.length() > 10_000) return false;

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == '(' || arrayChar[i] == '{' || arrayChar[i] == '[') {
                list.add(arrayChar[i]);
            }
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
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidParentheses.isValid("()[]{}"));
        System.out.println(ValidParentheses.isValid("(]"));
    }
}

