package com.sergax.tasks.first_bad_version;

import com.sergax.tasks.implement_strstr.Solution;
import org.junit.jupiter.api.Test;

import static com.sergax.tasks.first_bad_version.Max_SubArray.maxSubArray;
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
