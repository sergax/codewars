package com.sergax.tasks.oddint;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author: sergax
 * @date: 05.08.22
 * <p>
 * find odd number
 */
public class Solution {

    public static int findIt(int[] a) {
        final Map<Integer, Integer> map = new HashMap<>();
        var result = 0;
        var count = 0;

        for (var i : a) {
            if (map.containsKey(i)) {

                count = map.get(i);
                map.put(i, ++count);
            } else {

                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() % 2 != 0) {
                result = m.getKey();
            }
        }

        return result;
    }

    @Test
    public void findTest() {
        assertEquals(5, Solution.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        assertEquals(-1, Solution.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        assertEquals(5, Solution.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        assertEquals(10, Solution.findIt(new int[]{10}));
        assertEquals(10, Solution.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        assertEquals(1, Solution.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }
}
