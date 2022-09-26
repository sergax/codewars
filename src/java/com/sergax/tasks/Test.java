package com.sergax.tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: sergax
 * @date: 21.07.22
 */
public class Test {
    public static Map<Integer, Integer> countOfNumber(List<Integer> array) {
//        var count = 0;
        var map = new HashMap<Integer, Integer>();
        for (var i : array) {
            if (map.containsKey(i)) {
                int v = map.get(i);
                map.put(i, ++v);
            } else {
                map.put(i, 1);
            }
//            count = map.getOrDefault(i, 0) + 1;
        }

        System.out.println(map);
        return map;
    }

    public static void moreThenOne(Map<Integer, Integer> newMap) {
        for (Map.Entry<Integer, Integer> m : newMap.entrySet()) {
            if (m.getValue() > 2) {
                System.out.println(m.getValue() + " " + m.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerMap = Test.countOfNumber(List.of(1, 2, 3, 2, 5, 5, 5));
        Test.moreThenOne(integerIntegerMap);
    }
}
