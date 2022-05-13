package com.sergax.tasks.max_sub_array;

/**
 * by Aksenchenko Serhii on 13.05.2022
 */

public class Max_SubArray {
    private static int sum = 0;
    private static int maxSum = Integer.MIN_VALUE;

    public static int maxSubArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum = Math.max(sum, nums[i]);
            maxSum = Math.max(sum, maxSum);

        }
        return maxSum;
    }
}
