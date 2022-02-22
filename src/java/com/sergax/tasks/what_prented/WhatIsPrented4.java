package com.sergax.tasks.what_prented;

class WhatIsPrented4 {
    int valInt;
    double valDou;
    boolean valBool;
}

class Class {
    public static void main(String[] args) {
        WhatIsPrented4 w = new WhatIsPrented4();
        System.out.println(w.valInt);
        System.out.println(w.valDou);
        System.out.println(w.valBool);

        //print -> 0; 0.0 ; false
    }
}
