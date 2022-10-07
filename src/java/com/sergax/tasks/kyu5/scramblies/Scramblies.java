package com.sergax.tasks.kyu5.scramblies;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        if (str2 == null || str2.length() == 0) {
            return true;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()
        ) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()
        ) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()
        ) {
            try {
                if (entry.getValue() > map1.get(entry.getKey())) return false;
            } catch (NullPointerException ex) {
                return false;
            }
        }
        return true;
    }

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    @Order(1)
    public void sampleTests() {
        testing(Scramblies.scramble("rkqodlw", "world"), true);
        testing(Scramblies.scramble("cedewaraaossoqqyt", "codewars"), true);
        testing(Scramblies.scramble("katas", "steak"), false);
        testing(Scramblies.scramble("scriptjavx", "javascript"), false);
        testing(Scramblies.scramble("scriptingjava", "javascript"), true);
        testing(Scramblies.scramble("scriptsjava", "javascripts"), true);
        testing(Scramblies.scramble("javscripts", "javascript"), false);
        testing(Scramblies.scramble("aabbcamaomsccdd", "commas"), true);
        testing(Scramblies.scramble("commas", "commas"), true);
        testing(Scramblies.scramble("sammoc", "commas"), true);
    }

    @Test
    @Order(2)
    public void largeTest() {
        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);

        testing(Scramblies.scramble(s1, s2), true);
    }
}
