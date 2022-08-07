package com.sergax.tasks.high_and_low;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author: sergax
 * @date: 28.07.22
 * <p>
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * <p>
 * Examples
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */
public class Solution {

    public static String highAndLow(String numbers) {
        // Code here or
        var stats = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();

        return stats.getMax() + " " + stats.getMin();
    }

    @Test
    public void test1() {
        assertEquals("42 -9", Solution.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void test2() {
        assertEquals("3 1", Solution.highAndLow("1 2 3"));
    }
}
