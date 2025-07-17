package practice;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntExample {
    static volatile int isVolatile = 0;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);

        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
                isVolatile++;
                counter.incrementAndGet();
                System.out.println("thread ===");
                System.out.println(isVolatile);
                System.out.println(counter);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.get()); // Expected: 2000
    }
}
