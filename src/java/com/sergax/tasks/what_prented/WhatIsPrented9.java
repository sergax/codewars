package com.sergax.tasks.what_prented;

public class WhatIsPrented9 {
    public static void main(String[] args) {
        String string = "hello";
        final String string1 = "hel";
        String string2 = "lo";

        System.out.println(string == string1 + string2);
        System.out.println(string.equals(string1 + string2));
    }
}
