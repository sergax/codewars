package com.sergax.tasks.kuy8_7.diff_volumes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        var integer1 = Arrays.stream(firstCuboid).boxed().reduce((x, y) -> x * y).get();
        var integer2 = Arrays.stream(secondCuboid).boxed().reduce((x, y) -> x * y).get();
        return Math.abs(integer1 - integer2);
    }

    @Test
    public void sampleTestCases() {
        assertEquals(14, CuboidVolumes.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        assertEquals(106, CuboidVolumes.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        assertEquals(30, CuboidVolumes.findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        assertEquals(31, CuboidVolumes.findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        assertEquals(0, CuboidVolumes.findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }
}
