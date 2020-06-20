package ch283;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void moveZeroes() {
        int[] testArr = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(testArr);
        Assert.assertEquals("[1, 3, 12, 0, 0]", Arrays.toString(testArr));
    }
}