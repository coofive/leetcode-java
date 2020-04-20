package ch26;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/20/2020 9:44 PM
 */
public class SolutionTest {

    @Test
    public void removeDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        int length = new Solution().removeDuplicates(nums);
        Assert.assertEquals("预期数组计算后长度为2", 2, length);
        Assert.assertEquals("打印结果应为[1, 2]", "[1, 2]", Arrays.toString(Arrays.copyOf(nums, length)));
    }
}