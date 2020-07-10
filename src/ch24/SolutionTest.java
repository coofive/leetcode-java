package ch24;

import base.ListNode;
import base.ListNodeHelper;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void swapPairs() {
        int[] origin = new int[]{1, 2, 3, 4};
        int[] expect = new int[]{2, 1, 4, 3};
        ListNode testNode = ListNodeHelper.generateListNode(origin);
        ListNode actualNode = solution.swapPairs(testNode);
        ListNode expectNode = ListNodeHelper.generateListNode(expect);
        Assert.assertEquals(ListNodeHelper.extractListNode(expectNode), ListNodeHelper.extractListNode(actualNode));
    }
}