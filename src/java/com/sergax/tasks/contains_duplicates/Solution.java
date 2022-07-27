package com.sergax.tasks.contains_duplicates;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: sergax
 * @date: 27.07.22
 */

public class Solution {
    static boolean containsDuplicates(int[] array) {
        Set<Integer> map = new HashSet<>();
        for (int i : array) {
            if (!map.contains(i)) {
                map.add(i);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Solution.containsDuplicates(new int[]{1, 2, 3, 5}));
    }
}
