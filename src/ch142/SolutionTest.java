package ch142;

import base.ListNode;
import base.ListNodeHelper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void detectCycle() {
        int[] arr1 = new int[]{3, 2, 0, -4};
        ListNode testNode1 = ListNodeHelper.generateCycleListNode(arr1, -4, 2);
        Assert.assertEquals(ListNodeHelper.cache.get(2),solution.detectCycle(testNode1));

        int[] arr2 = new int[]{1, 2};
        ListNode testNode2 = ListNodeHelper.generateCycleListNode(arr2, 2, 1);
        Assert.assertEquals(ListNodeHelper.cache.get(1),solution.detectCycle(testNode2));

        int[] arr3 = new int[]{1};
        ListNode testNode3 = ListNodeHelper.generateCycleListNode(arr3, 1, -1);
        Assert.assertNull(solution.detectCycle(testNode3));
    }
}