package ch1114;

import java.util.concurrent.CountDownLatch;

/**
 * A<B B<C A->C
 * @author coofive
 */
public class FooWithCountdownLatch {
    CountDownLatch countFirstAndSecond = new CountDownLatch(1);
    CountDownLatch countSecondAndThird = new CountDownLatch(1);

    public FooWithCountdownLatch() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        countFirstAndSecond.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        countFirstAndSecond.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        countSecondAndThird.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        countSecondAndThird.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
