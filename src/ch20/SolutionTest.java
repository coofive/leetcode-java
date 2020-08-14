package ch20;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void isValid() {
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));
        Assert.assertFalse(solution.isValid("([)]"));
        Assert.assertTrue(solution.isValid("{[]}"));
        Assert.assertTrue(solution.isValid(""));
    }
}