package ch53;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * todo 分治法/贪心/动态规划（Kadane算法）
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/27/2020 8:42 PM
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;

    }
}
