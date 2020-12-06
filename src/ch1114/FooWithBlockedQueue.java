package ch1114;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * A<B B<C -> A<C
 * @author coofive
 */
public class FooWithBlockedQueue {

    BlockingQueue<Integer> blockingQueueFirstAndSecond = new ArrayBlockingQueue<>(8);
    BlockingQueue<Integer> blockingQueueSecondAndThird = new ArrayBlockingQueue<>(8);

    public FooWithBlockedQueue() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        blockingQueueFirstAndSecond.put(1);
    }

    public void second(Runnable printSecond) throws InterruptedException {
        blockingQueueFirstAndSecond.take();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        blockingQueueSecondAndThird.put(1);
    }

    public void third(Runnable printThird) throws InterruptedException {
        blockingQueueSecondAndThird.take();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
