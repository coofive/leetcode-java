package ch84;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void largestRectangleArea() {
        int[] test1 = new int[]{2, 1, 5, 6, 2, 3};
        Assert.assertEquals(10, solution.largestRectangleArea(test1));

        int[] test2 = new int[]{1};
        Assert.assertEquals(1, solution.largestRectangleArea(test2));

        int[] test3 = new int[]{1, 1};
        Assert.assertEquals(2, solution.largestRectangleArea(test3));

        int[] test4 = new int[]{4, 2, 0, 3, 2, 4, 3, 4};
        Assert.assertEquals(10, solution.largestRectangleArea(test4));
    }
}