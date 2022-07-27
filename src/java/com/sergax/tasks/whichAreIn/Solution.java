package com.sergax.tasks.whichAreIn;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author: sergax
 * @date: 27.07.22
 * <p>
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * <p>
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns ["arp", "live", "strong"]
 * <p>
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns []
 * <p>
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: r must be without duplicates.
 */
class Solution {
    static String[] inArray(String[] array1, String[] array2) {
        Set<String> set = new TreeSet<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    set.add(s1);
                }
            }
        }
        return set.toArray(String[]::new);
    }

    static String[] inArray2(String[] array1, String[] array2) {
        return Stream.of(array1)
                .filter(s -> Arrays.stream(array2).anyMatch(a -> a.contains(s)))
                .sorted()
                .toArray(String[]::new);
    }

    @Test
    public void test1() {
        String a[] = new String[]{"arp", "live", "strong"};
        String b[] = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String r[] = new String[]{"arp", "live", "strong"};
        assertArrayEquals(r, Solution.inArray(a, b));
        assertArrayEquals(r, Solution.inArray2(a, b));
    }
}
