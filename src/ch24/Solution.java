package ch24;

import base.ListNode;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-07-05 21:38
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode guard = new ListNode(-1);
        guard.next = head;

        ListNode prev = guard;
        while (head != null && head.next != null) {
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // swap
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            prev.next = secondNode;

            prev = firstNode;
            head = firstNode.next;
        }

        return guard.next;
    }
}

