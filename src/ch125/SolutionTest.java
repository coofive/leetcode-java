package ch125;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void isPalindrome() {
        Assert.assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(solution.isPalindrome("race a car"));
    }
}