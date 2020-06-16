package ch11;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxArea() {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(49, solution.maxArea(arr));
    }
}