package ch70;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void climbStairs() {
        Assert.assertEquals(1,solution.climbStairs(1));
        Assert.assertEquals(2,solution.climbStairs(2));
        Assert.assertEquals(3,solution.climbStairs(3));
        Assert.assertEquals(5,solution.climbStairs(4));
        Assert.assertEquals(8,solution.climbStairs(5));
    }
}