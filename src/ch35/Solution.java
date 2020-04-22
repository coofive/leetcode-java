package ch35;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/22/2020 9:44 PM
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == target)) {
                return i;
            }
            if ((nums[i]) > target) {
                return i;
            }
        }
        return nums.length;
    }
}
