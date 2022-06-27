package com.sergax.tasks.bit_counting;

import java.util.Arrays;

/**
 * @author : sergax
 * @date : 27.06.22
 * <p>
 * Write a function that takes an integer as input, and returns the number of bits that are equal to
 * one in the binary representation of that number. You can guarantee that input is non-negative.
 * <p>
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */
public class BitCounting {
    private static final String ONE = "1";
    public static int countBits(int n) {
        //TODO: Show me the code!
        return Math.toIntExact(Arrays.stream(Integer.toBinaryString(n).split(""))
                .filter(m -> m.equals(ONE))
                .count());
    }

    public static void main(String[] args) {
        System.out.println(BitCounting.countBits(100));
    }
}
