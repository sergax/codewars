package com.sergax.tasks.multiples_3_5;

import java.util.stream.IntStream;

/**
 * @author : sergax
 * @date : 27.06.22
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally,
 * if the number is negative, return 0 (for languages that do have them).
 * <p>
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 */
public class Solution {
    private static int sum = 0;
    public static int solution(int number) {
        if (number < 0) return 0;
        //TODO: Code stuff here
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int solution2(int number2) {
        return IntStream.range(0, number2)
                .filter(number -> (number % 3 == 0) || (number % 5 == 0))
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(101));
        System.out.println(Solution.solution2(10));
    }
}

