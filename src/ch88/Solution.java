package ch88;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-08-02 15:46
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int max = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[max--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        // 如果p1>=0,剩余的数据操作可以省略,因为本身在nums1中已经排序好了
        // 如果p2>=0,此时只需要再将num2的剩余数据填充至nums1,有可能p2=-1,即不需要任何操作
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
