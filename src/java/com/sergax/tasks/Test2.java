package com.sergax.tasks;

import java.util.Arrays;
import java.util.LinkedList;

public class Test2 {

    public static void main(String[] args) {
        double[] numbers = new double[]{-2.398};
        String localPrefix = new String("5").intern();
        String s = "5";
        if (localPrefix == s) System.out.println("+");
        double sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }

}