package com.sergax.tasks.max_sub_array;

import org.junit.jupiter.api.Test;

import static com.sergax.tasks.max_sub_array.Max_SubArray.maxSubArray;
import static org.junit.jupiter.api.Assertions.*;

/**
 * by Aksenchenko Serhii on 14.05.2022
 */

class Max_SubArrayTest {

    @Test
    public void test_MaxSubArray() {
        assertEquals(6, maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
