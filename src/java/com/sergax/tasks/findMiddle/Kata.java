package com.sergax.tasks.findMiddle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author: sergax
 * @date: 07.08.22
 * <p>
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd,
 * return the middle character. If the word's length is even, return the middle 2 characters.
 * <p>
 * Kata.getMiddle("test") should return "es"
 * Kata.getMiddle("testing") should return "t"
 * Kata.getMiddle("middle") should return "dd"
 * Kata.getMiddle("A") should return "A"
 */
public class Kata {
    public static String getMiddle(String word) {
        //Code goes here!
        int length = word.length();
        int middle = word.length() / 2;
        if (length % 2 == 0)
            return word.substring(middle - 1, middle + 1);
        return word.substring(middle, middle + 1);
    }

    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("dd", Kata.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("A", Kata.getMiddle("A"));
    }
}
