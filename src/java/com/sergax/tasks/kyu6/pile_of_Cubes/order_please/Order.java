package com.sergax.tasks.kyu6.pile_of_Cubes.order_please;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Order {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(w -> Integer.valueOf(w.replaceAll("\\D+", ""))))
                .collect(Collectors.joining(" "));
    }

    @Test
    public void test1() {
        assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
    }
}
