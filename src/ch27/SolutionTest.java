package ch27;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/21/2020 10:07 PM
 */
public class SolutionTest {

    @Test
    public void removeElement() {
        int[] nums = new int[]{3, 2, 2, 3};
        Solution solution = new Solution();
        int length = solution.removeElement(nums, 3);
        Assert.assertEquals("移除等于3的元素，数组大小为2", 2, length);
        Assert.assertEquals("打印结果应为[2, 2]", "[2, 2]", Arrays.toString(Arrays.copyOf(nums, length)));
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int length2 = solution.removeElement(nums2, 2);
        Assert.assertEquals("移除等于2的元素，数组大小为5", 5, length2);
        Assert.assertEquals("打印结果应为[0, 1, 3, 0, 4]", "[0, 1, 3, 0, 4]", Arrays.toString(Arrays.copyOf(nums2, length2)));
    }
}