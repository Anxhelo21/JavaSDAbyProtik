package DesignPattern.Singleton;

public class EagerSimpleCounter {

    // static field in which we keep the singleton reference
    // it is an eager singleton so we create an instance by assigning it to the field
    private static final EagerSimpleCounter INSTANCE = new EagerSimpleCounter();
    private int currentCount = 0;

    public static EagerSimpleCounter getInstance() {
        return INSTANCE;
    }

    // hidden constructor
    private EagerSimpleCounter() {}

    public int getCurrentCount() {
        return INSTANCE.currentCount;
    }

    public void increment() {
        INSTANCE.currentCount++;
    }

    public void decrement(){
        INSTANCE.currentCount--;
    }

    @Override
    public String toString(){
        return String.valueOf(currentCount);
    }
}
