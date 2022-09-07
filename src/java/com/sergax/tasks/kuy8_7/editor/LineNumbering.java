package com.sergax.tasks.kuy8_7.editor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * [] --> []
 * ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        // TODO
        int number = 1;
        List<String> result = new ArrayList<>();
        for (String s: lines) {
            result.add(number + ": " + s);
            number++;
        }
        System.out.println(Arrays.toString(result.toArray()));
        return result;
    }

    @Test
    public void basicTests() {
        assertEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(Arrays.asList("", "", "", "", "")));
    }
}
