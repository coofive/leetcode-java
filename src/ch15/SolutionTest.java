package ch15;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void threeSum() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = solution.threeSum(nums);

        List<Integer> expect1 = new ArrayList<>();
        expect1.add(-1);
        expect1.add(0);
        expect1.add(1);
        Assert.assertTrue(res.stream().anyMatch(ex->ex.equals(expect1)));

        List<Integer> expect2 = new ArrayList<>();
        expect2.add(-1);
        expect2.add(-1);
        expect2.add(2);
        Assert.assertTrue(res.stream().anyMatch(ex->ex.equals(expect2)));
    }
}