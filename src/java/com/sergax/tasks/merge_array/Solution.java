package com.sergax.tasks.merge_array;

import java.util.Arrays;

/**
 * @author: sergax
 * @date: 01.08.22
 */
public class Solution {
    public static int[] mergeSorted(int[] input1, int[] input2) {
        int[] result = new int[input1.length + input2.length];
        System.arraycopy(input1, 0, result, 0, input1.length);
        System.arraycopy(input2, 0, result, input1.length, input2.length);
        Arrays.sort(result);
        int i = 0;
        while (i < result.length) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        Solution.mergeSorted(new int[]{1, 5, 6, 9, 10, 11}, new int[]{2, 4, 3});
    }
}

