package com.sergax.tasks.find_intruder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sergax
 * @date: 31.07.22
 */
public class Solution {
    static void findTheIntruder(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String s1 : s.split(",")) {
            int abs = Math.abs(Integer.parseInt(s1.trim()));
            if (map.containsKey(abs)) {
                var count = map.get(abs);
                map.put(abs, ++count);
            } else {
                map.put(abs, 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                System.out.println(m.getKey());
            }
        }
    }

    public static void main(String... piu) {
        Solution.findTheIntruder("6, 1, 7, 8, -6, -7, 3, -8, -1");
    }
}
