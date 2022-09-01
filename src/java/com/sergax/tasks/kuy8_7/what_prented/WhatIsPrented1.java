package com.sergax.tasks.kuy8_7.what_prented;

import java.util.ArrayList;
import java.util.List;

public class WhatIsPrented1 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("a");
        array.add("b");
        changeThis(array);
        System.out.println(array);
    }

    public static void changeThis(List<String> array) {
        array.add("c");
        array.remove("b");
        array.add("d");
        array = null;
    }
    //print -> a,c,d
}
