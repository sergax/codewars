package com.sergax.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author: sergax
 * @date: 02.08.22
 */
public class Test3 {
    public static long findNextSquare(long sq) {
        var firstSqrt = Math.sqrt(sq); // 11
        if (firstSqrt % 1 != 0)
            return -1;
        firstSqrt++;

        return (long) Math.pow(firstSqrt, 2);
    }

    @Test
    public void test() {
        assertEquals(144, Test3.findNextSquare(121));
        assertEquals(676, Test3.findNextSquare(625));
        assertEquals(-1, Test3.findNextSquare(114));
    }
}
