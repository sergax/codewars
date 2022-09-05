package com.sergax.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 5, 33, 8));
        Collection<Integer> collect = collection.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }

}