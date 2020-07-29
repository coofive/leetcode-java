package ch189;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void rotate() {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expect1 = new int[]{5, 6, 7, 1, 2, 3, 4};
        solution.rotate(test1, 3);
        Assert.assertEquals(Arrays.toString(expect1), Arrays.toString(test1));

        int[] test2 = new int[]{-1, -100, 3, 99};
        int[] expect2 = new int[]{3, 99, -1, -100};
        solution.rotate(test2, 2);
        Assert.assertEquals(Arrays.toString(expect2), Arrays.toString(test2));

        int[] test3 = new int[]{1, 2, 3, 4, 5};
        int[] expect3 = new int[]{4, 5, 1, 2, 3};
        solution.rotate(test3, 2);
        Assert.assertEquals(Arrays.toString(expect3), Arrays.toString(test3));

        int[] test4 = new int[]{1, 2, 3, 4, 5, 6};
        int[] expect4 = new int[]{5, 6, 1, 2, 3, 4};
        solution.rotate(test4, 2);
        Assert.assertEquals(Arrays.toString(expect4), Arrays.toString(test4));
    }
}