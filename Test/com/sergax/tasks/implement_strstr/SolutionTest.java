package com.sergax.tasks.implement_strstr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {

    @Test
    public void test_Solution() {
        Solution solution = new Solution();
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(0, solution.strStr("hello", ""));
        assertEquals(4, solution.strStr("hello", "o"));
    }
}