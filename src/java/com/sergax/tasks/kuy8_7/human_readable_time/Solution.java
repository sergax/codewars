package com.sergax.tasks.kuy8_7.human_readable_time;

/**
 * @author : sergax
 * @date : 09.07.22
 * <p>
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 * <p>
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 * <p>
 * You can find some examples in the test fixtures.
 */
public class Solution {
    public static String makeReadable(int seconds) {
        // Do something
        // min = 60 sec
        // hour = 360 sec
        int sec = seconds % 60;
        int min = (seconds / 60) % 60;
        int hour = (seconds / 60) / 60;

        String second = (sec < 10) ? "0" + sec : Integer.toString(sec);
        String minute = (min < 10) ? "0" + min : Integer.toString(min);
        String hours = (hour < 10) ? "0" + hour : Integer.toString(hour);

        return String.format(hours + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        System.out.println(Solution.makeReadable(359999));
    }
}
