package ch53;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/27/2020 8:43 PM
 */
public class SolutionTest {

    @Test
    public void maxSubArray() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.maxSubArray(nums));
    }
}