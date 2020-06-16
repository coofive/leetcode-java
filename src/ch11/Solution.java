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
            int minHeight = height[left] < height[right] ? height[left++] : height[right--];
            // 不管是left++还是right--,都会使距离缩短1，而要计算当前宽度需要加1
            int area = (right - left + 1) * minHeight;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
