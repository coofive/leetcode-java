package ch21;

import base.ListNode;
import base.ListNodeHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void mergeTwoLists() {
        int[] test1 = new int[]{1, 2, 4};
        ListNode testListNode1 = ListNodeHelper.generateListNode(test1);
        int[] test2 = new int[]{1, 3, 4};
        ListNode testListNode2 = ListNodeHelper.generateListNode(test2);
        ListNode actualListNode = solution.mergeTwoLists(testListNode1, testListNode2);

        int[] expect = new int[]{1, 1, 2, 3, 4, 4};
        Assert.assertEquals(ListNodeHelper.extractListNode(ListNodeHelper.generateListNode(expect)), ListNodeHelper.extractListNode(actualListNode));
    }
}