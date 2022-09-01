package com.sergax.tasks.kuy8_7.what_prented;

public class WhatPrented8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for(int e : arr) {
            System.out.print(e);
            e += 5;
        }
        System.out.println();
        for (int e : arr) {
            System.out.print(e);
        }
    }
    //print -> 123 123
}
