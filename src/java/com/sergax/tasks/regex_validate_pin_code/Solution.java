package com.sergax.tasks.regex_validate_pin_code;

/**
 * @author : sergax
 * @date : 13.06.22
 *
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 *
 * If the function is passed a valid PIN string, return true, else return false.
 *
 * Examples (Input --> Output)
 * "1234"   -->  true
 * "12345"  -->  false
 * "a234"   -->  false
 */
public class Solution {
    public static boolean validatePin(String pin) {
        // Your code here...
        return pin.length() == 6 && pin.matches("[0-9]+")||
                pin.length() == 4 && pin.matches("[0-9]+");
    }
}
