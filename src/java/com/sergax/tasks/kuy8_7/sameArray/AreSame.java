package com.sergax.tasks.kuy8_7.sameArray;

import java.util.Arrays;

/**
 * @author: sergax
 * @date: 24.07.22
 */
public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;

        int[] c = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(c);
        Arrays.sort(b);
        return Arrays.equals(c, b);
    }

    public static void main(String[] args) {
        System.out.println(AreSame.comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
    }
}

