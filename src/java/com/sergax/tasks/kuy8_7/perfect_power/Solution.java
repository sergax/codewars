package com.sergax.tasks.kuy8_7.perfect_power;

import java.util.Arrays;

/**
 * @author: sergax
 * @date: 27.07.22
 * <p>
 * A perfect power is a classification of positive integers:
 * In mathematics, a perfect power is a positive integer that can be expressed as an integer power of another positive integer.
 * More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that mk = n.
 * Your task is to check wheter a given integer is a perfect power. If it is a perfect power, return a pair m and k
 * with mk = n as a proof. Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.
 * Note: For a perfect power, there might be several pairs. For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions.
 * However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.
 * <p>
 * Examples
 * isPerfectPower(4) => new int[]{2,2}
 * isPerfectPower(5) => null
 * isPerfectPower(8) => new int[]{2,3}
 * isPerfectPower(9) => new int[]{3,2}
 */
class Solution {
    public static int[] isPerfectPower(int n) {
        // ...
        //if (Math.abs(n))
        // 9 = 3^2
        int number = (int) Math.sqrt(n);
//        int degree = Math.pow();

        int[] array = new int[2];
        array[0] = number;
//        array[1] = degree;

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.isPerfectPower(25)));
    }
}
