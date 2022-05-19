package com.sergax.tasks.plus_one;

class Solution1 {
    public static int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            if(digits[digits.length -1] != 10)
                return digits;
            digits[digits.length - 1] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
