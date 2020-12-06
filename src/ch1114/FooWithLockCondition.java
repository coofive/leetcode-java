package ch1114;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author coofive
 */
public class FooWithLockCondition {

    private volatile int count;

    private final Lock lock = new ReentrantLock();

    Condition firstCondition = lock.newCondition();
    Condition secondCondition = lock.newCondition();
    Condition thirdCondition = lock.newCondition();

    public FooWithLockCondition() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            while (count != 0) {
                firstCondition.await();
            }
            count = 1;
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            secondCondition.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try {
            while (count != 1) {
                secondCondition.await();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            count = 2;
            thirdCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (count != 2) {
                thirdCondition.await();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            count = 0;
            firstCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
