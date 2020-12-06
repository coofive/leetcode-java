package ch1114;

/**
 * @author coofive
 */
public class FooTestMain {
    public static void main(String[] args) {
        // Foo foo = new Foo();
        // FooWithBlockedQueue foo = new FooWithBlockedQueue();
        // FooWithCountdownLatch foo = new FooWithCountdownLatch();
        // FooWithLockCondition foo = new FooWithLockCondition();
        FooWithSemaphore foo = new FooWithSemaphore();

        new Thread(() -> {
            try {
                foo.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                foo.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                foo.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
