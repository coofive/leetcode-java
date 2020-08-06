package ch88;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void merge() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int[] expect = new int[]{1, 2, 2, 3, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        Assert.assertEquals(Arrays.toString(nums1), Arrays.toString(expect));
    }
}