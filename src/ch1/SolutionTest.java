package ch1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 3/3/2020 9:50 PM
 */
public class SolutionTest {

    @Test
    public void twoSum() {
        final int[] nums = {2,7,11,15};
        final int target = 9;
        int[] result = new Solution().twoSum(nums, target);
        Assert.assertEquals(Arrays.toString(result),Arrays.toString(new int[]{0,1}));
    }
}