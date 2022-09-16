package com.sergax.tasks.kuy8_7.printer_errors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Printer {
    public static String printerError(String s) {
        // your code
        return s.chars().filter(l -> l > 'm').count() + "/" + s.length();
    }

    @Test
    public void testPrinter() {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxxx";
        assertEquals("3/56", Printer.printerError(s));
    }
}
