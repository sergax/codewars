package com.sergax.tasks.kuy8_7.what_prented;

public class WhatPrented5 {
    public  class A {
        public void itStatic() {
            System.out.println("it A");
        }
        public void that() {
            System.out.println("that A");
        }
    }

    public  class B extends A {
//        public void itStatic() {
//            System.out.println("it B");
//        }

        @Override
        public void that() {
            System.out.println("that B");
        }
    }

    public  class  Test {
        public void main(String[] args) {
            A a = new A();
            a.that();

            A a1 = new B();
            a.that();

            B b = new B();
            b.that();
        }
    }
}
