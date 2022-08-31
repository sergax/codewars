package com.sergax.tasks;


import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Test3 {
    public static boolean findNextSquare(String str, String ending) {
        return str.endsWith(ending);
    }

    @Test
    public void test() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }

    private static void check(String str, String ending, boolean expected) {
        boolean result = Test3.findNextSquare(str, ending);
        assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
    }
}

