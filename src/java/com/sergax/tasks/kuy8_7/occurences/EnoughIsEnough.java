package com.sergax.tasks.kuy8_7.occurences;

import org.junit.Test;
import java.util.*;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        HashMap<Integer, Integer> map = new HashMap<>();
        return IntStream.of(elements)
                .filter(el ->
                        map.merge(el, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

        @Test
        public void deleteNth () throws Exception {
            assertArrayEquals(
                    new int[]{20, 37, 21},
                    EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1)
            );
            assertArrayEquals(
                    new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                    EnoughIsEnough.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

            );
            assertArrayEquals(
                    new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                    EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
            );
            assertArrayEquals(
                    new int[]{1, 1, 1, 1, 1},
                    EnoughIsEnough.deleteNth(new int[]{1, 1, 1, 1, 1}, 5)
            );
            assertArrayEquals(
                    new int[]{},
                    EnoughIsEnough.deleteNth(new int[]{}, 5)
            );

        }
    }
