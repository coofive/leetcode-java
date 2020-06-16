package ch70;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-17 06:02
 */
public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
