package com.sergax.tasks.equal_sides_of_an_array;

/**
 * @author : sergax
 * @date : 14.06.22
 * <p>
 * You are going to be given an array of integers. Your job is to take that array and find an index N where the sum
 * of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that
 * would make this happen, return -1.
 */
public class Solution {
    public static int findEvenIndex(int[] arr) {
        // your code
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            if (sum(arr, 0, first - 1) == sum(arr, first + 1, last)) {
                return first;
            }
            first++;
        }
        return -1;
    }

    private static int sum(int[] a, int first, int last) {
        if (first == 0 && last == -1) return 0;

        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += a[i];
        }
        return sum;
    }
}
