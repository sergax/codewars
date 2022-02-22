package com.sergax.tasks.what_prented;

public class WhatPrented8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for(int e : arr) {
            System.out.println(e);
            e += 5;
        }
        System.out.println();
        for (int e : arr) {
            System.out.println(e);
        }
        System.out.println();
    }
    //print -> 123 123
}
