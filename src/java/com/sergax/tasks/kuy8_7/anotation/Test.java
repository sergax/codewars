package com.sergax.tasks.kuy8_7.anotation;

/**
 * @author : sergax
 * @date : 18.07.22
 */

public class Test {
    @InjectRandomInt(min = 2, max = 7)
    private static int repeat;
    private static String message;

    public static String say() {
        for (int i = 0; i < repeat; i++) {

            System.out.println("message" + message);
        }

        return message;
    }

    @Override
    public String toString() {
        return "Test{" +
                "repeat=" + repeat +
                ", message='" + message + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Test.say());
    }
}
