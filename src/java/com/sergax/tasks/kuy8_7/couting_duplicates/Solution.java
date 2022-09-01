package com.sergax.tasks.kuy8_7.couting_duplicates;

/**
 * @author : sergax
 * @date : 11.07.22
 * <p>
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and
 * numeric digits that occur more than once in the input string. The input string can be assumed to
 * contain only alphabets (both uppercase and lowercase) and numeric digits.
 * <p>
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class Solution {
    public static int duplicateCount(String text) {
        //TODO Write your code here
        int count = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(firstLetter)) count++;
            text = text.replace(firstLetter, "");
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Solution.duplicateCount("indivisibility"));
    }
}
