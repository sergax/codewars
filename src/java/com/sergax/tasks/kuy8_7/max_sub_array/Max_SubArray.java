package com.sergax.tasks.kuy8_7.max_sub_array;

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

    public static void main(String[] args) {
        System.out.println(Max_SubArray.maxSubArray(new int[]{1, 2, 3, 4, 5, 6, -7}));
    }
}
