package ch15;

import java.util.*;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-20 07:10
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // 加速1:排完序后，如果最左侧的数值已经大于0了，说明a+b+c肯定>0了。
            if (nums[i] > 0) {
                return res;
            }
            // 加速2: 跳过计算过的数据，防止结果重复
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int sum = -nums[i];
            int head = i + 1;
            int tail = nums.length - 1;
            while (head < tail) {
                int tempSum = nums[head] + nums[tail];
                if (tempSum == sum) {
                    res.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                    // 加速3：跳过计算过的数据，防止结果重复
                    while (head < tail && nums[head] == nums[head + 1]) {
                        head++;
                    }
                    while (head < tail && nums[tail] == nums[tail - 1]) {
                        tail--;
                    }
                }
                if (tempSum >= sum) {
                    tail--;
                } else {
                    head++;
                }
            }
        }
        return res;
    }
}
