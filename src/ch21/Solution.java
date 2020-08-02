package ch21;

import base.ListNode;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-07-31 06:31
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        l2.next = mergeTwoLists(l2.next, l1);
        return l2;
    }
}
