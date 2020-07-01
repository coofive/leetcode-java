package ch206;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void reverseList() {
        int[] expectArr = new int[]{5, 4, 3, 2, 1};
        int[] testArr = new int[]{1, 2, 3, 4, 5};
        ListNode expectNode = generateListNode(expectArr);
        ListNode testNode = generateListNode(testArr);
        ListNode actualNode = solution.reverseList(testNode);
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