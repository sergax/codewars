package com.sergax.tasks.kyu6.pile_of_Cubes.sum_of_two;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

/**
 * [1, 2, 5, 3] -> 6 -> [0,2]
 * target - array[i]
 */
public class Sum {
    public static int[] method(int[] array, int target) throws IllegalAccessException {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int next = target - array[i];
            if (map.containsKey(next)) {
                return new int[]{map.get(next), i};
            }
            map.put(array[i], i);
        }
        throw new IllegalAccessException("Not found such elements");
    }

    @Test
    public void test1() throws IllegalAccessException {
        assertArrayEquals(new int[]{0, 1}, Sum.method(new int[]{1, 2, 5, 3, 10, 1}, 3));
    }

    @Test
    public void test2() throws IllegalAccessException {
        assertArrayEquals(new int[]{2, 4}, Sum.method(new int[]{1, 2, 5, 3, 10, 1}, 15));
    }

    @Test
    public void test3() throws IllegalAccessException {
        assertArrayEquals(new int[]{0, 5}, Sum.method(new int[]{1, 2, 5, 3, 10, 1}, 2));
    }
}
