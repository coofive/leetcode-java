package ch1114;

import java.util.concurrent.Semaphore;

/**
 * @author coofive
 */
public class FooWithSemaphore {
    Semaphore semaphoreFirstAndSecond = new Semaphore(0);
    Semaphore semaphoreSecondAndThird = new Semaphore(0);

    public FooWithSemaphore() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semaphoreFirstAndSecond.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        semaphoreFirstAndSecond.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        semaphoreSecondAndThird.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        semaphoreSecondAndThird.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        semaphoreFirstAndSecond.release();
    }
}
