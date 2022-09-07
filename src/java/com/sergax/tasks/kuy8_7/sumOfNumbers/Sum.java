package com.sergax.tasks.kuy8_7.sumOfNumbers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Sum {
    public static int GetSum(int a, int b) {
        int min = Math.min(a, b), max = Math.max(a, b);
        return IntStream.rangeClosed(min, max)
                .boxed()
                .reduce(Integer::sum)
                .get();
    }

    @Test
    public void Test1() {
        assertEquals(3, Sum.GetSum(-2, 3));
        assertEquals(-1, Sum.GetSum(0, -1));
    }
}
