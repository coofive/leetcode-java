package ch641;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wenwu.liu.o
 */
public class MyCircularDequeTest {

    @Test
    public void myCircularTest() {
        MyCircularDeque circularDeque = new MyCircularDeque(3);
        assertTrue(circularDeque.insertLast(1));
        assertTrue(circularDeque.insertLast(2));
        assertTrue(circularDeque.insertFront(3));
        // 已经满了，返回 false
        assertFalse(circularDeque.insertFront(4));
        assertTrue(circularDeque.isFull());

        Assert.assertEquals(2, circularDeque.getRear());
        assertTrue(circularDeque.deleteLast());

        assertTrue(circularDeque.insertFront(4));

        Assert.assertEquals(4, circularDeque.getFront());

    }
}