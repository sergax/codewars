package com.sergax.tasks.kyu6.pile_of_Cubes.tribonacci;

import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;

import static org.junit.Assert.assertArrayEquals;

public class Xbonacci {
    public static double[] tribonacci(double[] s, int n) {
        int from = s.length;
        double[] array = Arrays.copyOf(s, n);
        for (int i = from; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3];
        }
        return array;
    }

    private final double precision = 1e-10;

    @Test
    public void sampleTests() {
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, Xbonacci.tribonacci(new double[]{1, 1, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, Xbonacci.tribonacci(new double[]{0, 0, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, Xbonacci.tribonacci(new double[]{0, 1, 1}, 10), precision);
    }
}
