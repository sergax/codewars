package com.sergax.tasks.remove_element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * Solving :
 * [(1),2,5,(1),8,7,(1)] duplicate = 1
 * as result = [2,5,8,7, , , ]
 */

public class SolvingRemoveElement {
    private int count;

    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                newMap.put(count++, nums[i]);
        }
        System.out.println(newMap);
        return count;
    }
}
