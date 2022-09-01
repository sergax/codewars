package com.sergax.tasks.kuy8_7.list_filtering;

import java.util.List;

/**
 * @author : sergax
 * @date : 27.06.22
 * <p>
 * In this kata you will create a function that takes a list of non-negative integers and
 * strings and returns a new list with the strings filtered out.
 */
public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        //TODO: Return the List with the Strings filtered out
        return list.stream().filter(f -> f instanceof Integer).toList();
    }

    public static void main(String[] args) {
        System.out.println(Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
}
