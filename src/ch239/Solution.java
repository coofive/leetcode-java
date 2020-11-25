package ch239;


import java.util.ArrayDeque;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-08-29 10:33
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int firstMax = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            cleanDeque(nums, deque, i, k);
            deque.addLast(i);
            if (nums[i] > firstMax) {
                firstMax = nums[i];
            }
        }
        int[] output = new int[nums.length - k + 1];
        output[0] = firstMax;

        for (int i = k; i < nums.length; i++) {
            cleanDeque(nums, deque, i, k);
            deque.addLast(i);
            output[i - k + 1] = nums[deque.getFirst()];
        }

        return output;
    }

    /**
     * 清理双向对列
     * 只保留当前滑动窗口中有的元素的索引。
     * 移除比当前元素小的所有元素，它们不可能是最大的。
     */
    private void cleanDeque(int[] nums, ArrayDeque<Integer> deque, int i, int k) {
        // 只保留当前滑动窗口中有的元素的索引
        if (!deque.isEmpty() && deque.getFirst() == i - k) {
            deque.removeFirst();
        }
        // 移除比当前元素小的所有元素，他们不可能是最大的，循环移除，保证队列中最大的值
        while (!deque.isEmpty() && nums[i] > deque.getLast()) {
            deque.removeLast();
        }
    }
}
