package com.sergax.tasks;

import java.util.Arrays;

public class Test2 {
    public static int join(int[] array) {
        Arrays.sort(array);
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[0], array[array.length - 1]);
            min = Math.min(array[0], array[array.length - 1]);
        }
        System.out.println(max);
        System.out.println(min);
        return Arrays.stream(array).sorted().findFirst().getAsInt();
//        Arrays.stream(array).sorted().;
    }

    public static void main(String[] args) {
        System.out.println(Test2.join(new int[]{4,6,2,1,9,63,-134,566}));
    }

}