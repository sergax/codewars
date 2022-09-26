package com.sergax.tasks.kuy8_7.growth_population;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int result = 0;
        int population = p0;
        while (population < p) {
            population += population * percent / 100 + aug;
            result++;
        }
        return result;
    }


    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(Arge.nbYear(1500, 5, 100, 5000), 15);
        testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}

