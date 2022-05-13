package com.sergax.tasks.what_prented;

import java.util.Arrays;

public class WhatIsPrented3 {
    public static void main(String[] args) {
        System.out.println(getSum("75", "25"));
        System.out.println(getSum1("75", "25"));
    }

    public static Integer getSum(String s, String s1) {
        return Integer.parseInt(s + s1);
    }

    public static String getSum1(String s, String s1) {
        return Integer.valueOf(s + s1).toString();
    }
    //print -> 7525; 7525
}
