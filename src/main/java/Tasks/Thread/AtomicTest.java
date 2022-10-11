package Tasks.Thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        counter();
    }

    static void counter() throws InterruptedException, ExecutionException {
        AtomicInteger atomicInteger = new AtomicInteger(9);
        List<Callable<Integer>> actions = Arrays.asList(
                () -> atomicInteger.addAndGet(1),
                () -> atomicInteger.addAndGet(1),
                atomicInteger::decrementAndGet,
                () -> atomicInteger.addAndGet(20),
                atomicInteger::decrementAndGet,
                () -> atomicInteger.addAndGet(2));
        ExecutorService atomic = Executors.newFixedThreadPool(5);
        List<Future<Integer>> results = atomic.invokeAll(actions);
        for (Future<Integer> result : results) {
            System.out.println(result.get());
        }

        AtomicInteger test = new AtomicInteger(0);
        test.addAndGet(100);
        test.decrementAndGet();
        System.out.println(test.get());
        System.out.println(test);
    }
}
