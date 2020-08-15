package ch11;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-16 05:47
 */
public class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int maxArea = 0;
        for (int left = 0, right = height.length - 1; left < right; ) {
            int area = (right - left) * (height[left] < height[right] ? height[left++] : height[right--]);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
