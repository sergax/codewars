package com.sergax.tasks.kyu6.pile_of_Cubes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ASum {
    public static long findNb(long m) {
        // your code
        List list = new ArrayList<>();
//        list.stream().map()
        return 0L;
    }
    @Test
    public void test1() {
        assertEquals(2022, ASum.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, ASum.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, ASum.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, ASum.findNb(40539911473216L));
    }
}
