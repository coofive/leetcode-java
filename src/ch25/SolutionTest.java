package ch25;

import base.ListNode;
import base.ListNodeHelper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void reverseKGroup() {
        int[] origin = new int[]{1, 2, 3, 4, 5};
        int[] expectEqualsTwo = new int[]{2, 1, 4, 3, 5};
        int[] expectEqualsThree = new int[]{3, 2, 1, 4, 5};
        // k=2
        ListNode testNodeEqualsTwo = ListNodeHelper.generateListNode(origin);
        ListNode actualNodeEqualsTwo = solution.reverseKGroup(testNodeEqualsTwo, 2);
        ListNode expectNodeEqualsTwo = ListNodeHelper.generateListNode(expectEqualsTwo);
        Assert.assertEquals(ListNodeHelper.extractListNode(expectNodeEqualsTwo), ListNodeHelper.extractListNode(actualNodeEqualsTwo));
        // k=3
        ListNode testNodeEqualsThree = ListNodeHelper.generateListNode(origin);
        ListNode actualNodeEqualsThree = solution.reverseKGroup(testNodeEqualsThree, 3);
        ListNode expectNodeEqualsThree = ListNodeHelper.generateListNode(expectEqualsThree);
        Assert.assertEquals(ListNodeHelper.extractListNode(expectNodeEqualsThree), ListNodeHelper.extractListNode(actualNodeEqualsThree));
    }
}