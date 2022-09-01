package com.sergax.tasks;

public class Test3 {
    public void A() {
        System.out.println("runing");
    }


    public static void main(String[] args) {
        Test3 test3 = new Audi();
        test3.A();
    }
}

class Audi extends Test3 {
    public void A() {
        System.out.println("Audi is runing");
    }

}