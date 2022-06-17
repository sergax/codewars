package com.sergax.tasks.square_digit;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author : sergax
 * @date : 17.06.22
 * <p>
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * <p>
 * Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {
    public static int squareDigits(int n) {
        // TODO Implement me

        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

}
