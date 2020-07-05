package ch24;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void swapPairs() {
        int[] origin = new int[]{1, 2, 3, 4};
        int[] expect = new int[]{2, 1, 4, 3};
        ListNode testNode = generateListNode(origin);
        ListNode actualNode = solution.swapPairs(testNode);
        ListNode expectNode = generateListNode(expect);
        Assert.assertEquals(extractListNode(expectNode), extractListNode(actualNode));
    }

    private ListNode generateListNode(int[] arr) {
        ListNode node = null;
        ListNode temp = null;
        ListNode curr = null;
        for (int value : arr) {
            curr = new ListNode(value);
            if (node == null) {
                node = curr;
                temp = curr;
            } else {
                temp.next = curr;
                temp = temp.next;
            }
        }
        return node;
    }

    private List<Integer> extractListNode(ListNode node) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = node;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return list;
    }
}