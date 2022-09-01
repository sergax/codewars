package com.sergax.tasks.kuy8_7.what_prented;

public class WhatIsPrented2 {
    public static void main(String[] args) {
        int i = 5;
        int j = ++i;
        int k = i++;
        System.out.println("i= " + i + ",j= " + j + ",k= " + k);
        //print -> 7, 6, 6
    }
}
