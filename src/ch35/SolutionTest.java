package ch35;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/22/2020 9:44 PM
 */
public class SolutionTest {

    @Test
    public void searchInsert() {
        int[] nums = new int[]{1,3,5,6};
        Solution solution = new Solution();
        Assert.assertEquals(2,solution.searchInsert(nums,5));
        Assert.assertEquals(1,solution.searchInsert(nums,2));
        Assert.assertEquals(4,solution.searchInsert(nums,7));
    }
}