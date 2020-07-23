package ch25;

import base.ListNode;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-07-22 06:22
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) {
            curr = curr.next;
            count++;
        }
        if (count == k) {
            curr = reverseKGroup(curr, k);

            for (int i = 0; i < count; i++) {
                ListNode tmp = head.next;
                head.next = curr;
                curr = head;
                head = tmp;
            }

            head = curr;
        }
        return head;
    }
}
