package ch84;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-08-23 09:12
 */
public class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null) {
            return 0;
        }
        int length = heights.length;
        int[] left = new int[length];
        int[] right = new int[length];
        Arrays.fill(right, length);

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                // 如果栈顶的元素比当前i的高度还高，那就是栈顶的元素的右边界
                right[stack.peek()] = i;
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            maxArea = Math.max(maxArea, (right[i] - left[i] - 1) * heights[i]);
        }
        return maxArea;
    }
}
