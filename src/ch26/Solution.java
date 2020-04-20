package ch26;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/20/2020 9:33 PM
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                continue;
            }
            nums[++i] = nums[j];
        }
        return i + 1;
    }
}
