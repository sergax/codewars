package com.sergax.tasks.kuy8_7.longest_prefix;

/**
 * @author: sergax
 * @date: 07.08.22
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // flower
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(Solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
