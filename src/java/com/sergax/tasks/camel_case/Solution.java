package com.sergax.tasks.camel_case;

import java.util.Arrays;

/**
 * @author : sergax
 * @date : 06.07.22
 * <p>
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case).
 * <p>
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */
public class Solution {
    static String toCamelCase(String str) {
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

    public static void main(String[] args) {
        System.out.println(Solution.toCamelCase("the-stealth-warrior"));
    }
}
