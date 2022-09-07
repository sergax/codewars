package com.sergax.tasks.kuy8_7.isograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Isogram {
    public static boolean isIsogram(String str) {
        // ...
        return str.length() == str.chars().distinct().count();
    }

    @Test
    public void FixedTests() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.isIsogram("isogram"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(false, Isogram.isIsogram("isIsogram"));
        assertEquals(false, Isogram.isIsogram("aba"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.isIsogram(""));
    }

}
