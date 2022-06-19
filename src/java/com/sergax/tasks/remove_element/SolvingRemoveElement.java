package com.sergax.tasks.remove_element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * Solving :
 * [(1),2,5,(1),8,7,(1)] duplicate = 1
 * as result = [2,5,8,7, , , ]
 * return count = 4
 */

public class SolvingRemoveElement {
    private int count;

    public Set removeElement(int[] nums, int val) {
        Set<Integer> newMap = new HashSet<>();
        for (int num : nums) {
            if (num != val)
                newMap.add(num);
        }
        return newMap;
    }

    public static void main(String[] args) {
        SolvingRemoveElement s = new SolvingRemoveElement();
        System.out.println(s.removeElement(new int[]{1, 2, 3, 4, 1}, 1));
    }
}
