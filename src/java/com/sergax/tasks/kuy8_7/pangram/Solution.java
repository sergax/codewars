package com.sergax.tasks.kuy8_7.pangram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author: sergax
 * @date: 28.07.22
 * <p>
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
 * the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * <p>
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
public class Solution {
    public boolean check(String str) {
        return str.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        Solution pc = new Solution();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        Solution pc = new Solution();
        assertEquals(false, pc.check(pangram2));
    }
}
