package com.sergax.tasks.valid_parentheses;

import com.sergax.tasks.implement_strstr.Solution;
import org.junit.jupiter.api.Test;

import javax.persistence.Table;

import static org.junit.jupiter.api.Assertions.*;

/**
 * by Aksenchenko Serhii on 21.04.2022
 */


class ValidParenthesesTest {

    @Test
    public void test_Valid() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("{}"));
        assertFalse(vp.isValid("{]"));
        assertFalse(vp.isValid("{}(}"));
        assertTrue(vp.isValid("()"));
    }
}