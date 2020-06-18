package ch1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author coofive
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums is empty!");
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length * 2);
        for (int i = 0; i < nums.length; i++) {
            Integer key = map.get(target - nums[i]);
            if (key != null) {
                return new int[]{key, i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution!");
    }
}