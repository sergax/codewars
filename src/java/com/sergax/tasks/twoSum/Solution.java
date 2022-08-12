package com.sergax.tasks.twoSum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: sergax
 * @date: 08.08.22
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // 1. Put all elements to map
        // 2. find difference between target and each elements
        // 3. if element + diff = target, so we check if this element not the same by index
        // 4. return first index and next
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (map.containsKey(number) && map.get(number) != i) {
                return new int[]{i, map.get(number)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
