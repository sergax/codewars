package com.sergax.tasks.kuy8_7.what_prented;

public class WhatIsPrented7 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
        } catch (Exception e) {
            System.out.println("B");
        } catch (Throwable e1) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
        System.out.println("E");
    }

    private static void badMethod() throws Exception {
        throw new Error();
    }
    //print -> A, C, D, E
}
