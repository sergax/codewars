package com.sergax.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: sergax
 * @date: 01.08.22
 */
public class LongestString {
    static int method() {
        List<String> list = List.of("abs", "a", "dsdkfdskl").stream().collect(Collectors.toList());
//        list.sort(Comparator.comparing(String::length).reversed());
        return list.stream().mapToInt(String::length).max().stream().sum();
    }

    public static void main(String[] args) {
        System.out.println(LongestString.method());
    }
}
