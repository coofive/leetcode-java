package ch167;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void twoSum() {
        int[] arr = new int[]{2, 7, 11, 15};
        int[] result = solution.twoSum(arr, 9);
        Assert.assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(result));
    }
}