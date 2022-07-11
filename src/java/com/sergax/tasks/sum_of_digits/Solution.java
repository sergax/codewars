package com.sergax.tasks.sum_of_digits;

/**
 * @author : sergax
 * @date : 11.07.22
 * <p>
 * Digital root is the recursive sum of all the digits in a number.
 * <p>
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing
 * in this way until a single-digit number is produced. The input will be a non-negative integer.
 * <p>
 * Examples
 * 16  -->  1 + 6 = 7
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */
public class Solution {
    public static int digital_root(int n) {
        //TODO ...
        int sum = 0;
        int last;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            last = n % 10;
            sum += last;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Solution.digital_root(493193));
    }
}
