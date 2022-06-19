package com.sergax.tasks.plus_one;

import java.util.Arrays;

class Solution1 {
    public static int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            System.out.println(digits[digits.length - 1]);
            if (digits[digits.length - 1] < 10) {
                return digits;
            } else {
                digits[digits.length - 1] = 1;
                int[] array = new int[]{};
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3, 4, 111})));
    }
}
