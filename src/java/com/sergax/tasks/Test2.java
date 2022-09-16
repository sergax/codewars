package com.sergax.tasks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test2 {
    public static String join(String[] array) {
        return String.join(" ", array);
    }

    public static void main(String[] args) {
        System.out.println(Test2.join(new String[]{"Bilal", "Djaghout"}));
    }

}