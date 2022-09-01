package com.sergax.tasks;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        double[] numbers = new double[]{-2.398};

        double sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }

}