package com.sergax.tasks.kuy8_7.length_of_last_word;

/**
 * by Aksenchenko Serhii on 15.05.2022
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        int index = 0;
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            index = array[array.length - 1].length();
        }
        return index;
    }
}
