package ch239;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void maxSlidingWindow() {
        int[] test1 = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] expect1 = new int[]{3, 3, 5, 5, 6, 7};
        Assert.assertEquals(Arrays.toString(expect1), Arrays.toString(solution.maxSlidingWindow(test1, 3)));

        int[] test2 = new int[]{1, -1};
        int[] expect2 = new int[]{1, -1};
        Assert.assertEquals(Arrays.toString(expect2), Arrays.toString(solution.maxSlidingWindow(test2, 1)));
    }
}