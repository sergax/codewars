package com.sergax.tasks.remove_element;

import java.util.HashMap;
import java.util.Map;

/***
 * Solving :
 * [(1),2,5,(1),8,7,(1)] duplicate = 1
 * as result = [2,5,8,7, , , ]
 * return count = 4
 */

public class SolvingRemoveElement {
    private int count;

    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int num : nums) {
            if (num != val)
                newMap.put(count++, num);
        }
        return count;
    }
}
