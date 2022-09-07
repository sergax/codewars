package com.sergax.tasks.kuy8_7.number_of_people_in_bus;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        assertEquals(5, Metro.countPassengers(list));
    }
}
