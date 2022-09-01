package com.sergax.tasks.kuy8_7.remove_duplicates_from_list;

/**
 * @author : sergax
 * @date : 27.05.22
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
