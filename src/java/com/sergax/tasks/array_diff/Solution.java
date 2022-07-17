package com.sergax.tasks.array_diff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : sergax
 * @date : 17.07.22
 * <p>
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 * <p>
 * It should remove all values from list a, which are present in list b keeping their order.
 * <p>
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * If a value is present in b, all of its occurrences must be removed from the other:
 * <p>
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */
public class Solution {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(b).boxed().collect(Collectors.toList());
        list1.removeAll(list2);
        return list1.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String... args) {
        System.out.printf(Arrays.toString(Solution.arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2})));
    }
}
