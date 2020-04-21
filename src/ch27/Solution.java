package ch27;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/21/2020 10:07 PM
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == val) {
                continue;
            }
            nums[i++] = nums[j];
        }
        return i;
    }
}