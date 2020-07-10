package ch206;

import base.ListNode;
import base.ListNodeHelper;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void reverseList() {
        int[] expectArr = new int[]{5, 4, 3, 2, 1};
        int[] testArr = new int[]{1, 2, 3, 4, 5};
        ListNode expectNode = ListNodeHelper.generateListNode(expectArr);
        ListNode testNode = ListNodeHelper.generateListNode(testArr);
        ListNode actualNode = solution.reverseList(testNode);
        Assert.assertEquals(ListNodeHelper.extractListNode(expectNode), ListNodeHelper.extractListNode(actualNode));
    }
}