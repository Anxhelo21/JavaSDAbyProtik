package DesignPattern.Singleton;

public class LazySimpleCounter {
    private int counter = 0;
    private static LazySimpleCounter INSTANCE;

    private LazySimpleCounter() {
    }

    public static LazySimpleCounter getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySimpleCounter.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySimpleCounter();
                }
            }
        }
        return INSTANCE;
    }

    public int getCounter() {
        return INSTANCE.counter;
    }

    public void increment() {
        INSTANCE.counter++;
    }

    public void decrement() {
        INSTANCE.counter--;
    }

    @Override
    public String toString() {
        return String.valueOf(counter);
    }
}

