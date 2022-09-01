package com.sergax.tasks.kuy8_7.sorting;

import java.util.Arrays;

/**
 * @author : sergax
 * @date : 14.06.22
 */
public class Order {
    private static int[] order(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int current = arr[i];
                    arr[i] = arr[j];
                    arr[j] = current;
                }
            }
        }
        return arr;
    }

    private static int[] reversed(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int current = arr[i];
                arr[i] = arr[j];
                arr[j] = current;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Sorted array : " + Arrays.toString(Order.order(new int[]{12, 10, 1, 5, 2, 8, 9})));
        System.out.println("Reversed array : " + Arrays.toString(Order.reversed(new int[]{12, 10, 1, 5, 2, 8, 9})));
    }
}
