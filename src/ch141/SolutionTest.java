package ch141;

import base.ListNode;
import base.ListNodeHelper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void hasCycle() {
        int[] arr1 = new int[]{3, 2, 0, -4};
        ListNode testNode1 = ListNodeHelper.generateCycleListNode(arr1, -4, 2);
        Assert.assertTrue(solution.hasCycle(testNode1));

        int[] arr2 = new int[]{1, 2};
        ListNode testNode2 = ListNodeHelper.generateCycleListNode(arr2, 2, 1);
        Assert.assertTrue(solution.hasCycle(testNode2));

        int[] arr3 = new int[]{1};
        ListNode testNode3 = ListNodeHelper.generateCycleListNode(arr3, 1, 1);
        Assert.assertTrue(solution.hasCycle(testNode3));
    }
}