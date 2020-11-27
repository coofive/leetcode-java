package ch622;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wenwu.liu.o
 */
public class MyCircularQueueTest {

    @Test
    public void testMyCircularQueue() {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        Assert.assertTrue(circularQueue.enQueue(1));
        Assert.assertTrue(circularQueue.enQueue(2));
        Assert.assertTrue(circularQueue.enQueue(3));
        Assert.assertFalse("队列已满", circularQueue.enQueue(4));

        Assert.assertEquals(3, circularQueue.Rear());
        Assert.assertTrue(circularQueue.isFull());

        Assert.assertTrue("取出一个数", circularQueue.deQueue());

        Assert.assertTrue(circularQueue.enQueue(4));

        Assert.assertEquals(4, circularQueue.Rear());
    }
}