package com.sergax.tasks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Test2 {

    public int countSheeps(Boolean[] arrayOfSheeps) {
            return (int) Arrays.stream(arrayOfSheeps).filter(Boolean.TRUE::equals).count();
    }
        Boolean[] array1 = {true, null, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        @Test
        public void test() {
            assertEquals("There are 16 sheeps in total", 16, new Test2().countSheeps(array1));
        }
}