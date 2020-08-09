package ch66;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void plusOne() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] expect1 = new int[]{1, 2, 4};
        int[] actual1 = solution.plusOne(nums1);
        Assert.assertEquals(Arrays.toString(expect1), Arrays.toString(actual1));

        int[] nums2 = new int[]{4, 3, 2, 1};
        int[] expect2 = new int[]{4, 3, 2, 2};
        int[] actual2 = solution.plusOne(nums2);
        Assert.assertEquals(Arrays.toString(expect2), Arrays.toString(actual2));

        int[] nums3 = new int[]{0};
        int[] expect3 = new int[]{1};
        int[] actual3 = solution.plusOne(nums3);
        Assert.assertEquals(Arrays.toString(expect3), Arrays.toString(actual3));
    }
}