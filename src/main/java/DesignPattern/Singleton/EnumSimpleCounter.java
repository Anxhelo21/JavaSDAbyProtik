package DesignPattern.Singleton;

public enum EnumSimpleCounter {
    INSTANCE;

    int counter = 0;

    public int getCounter(){
        return INSTANCE.counter;
    }

    public void increment(){
        INSTANCE.counter++;
    }

    public void decrement(){
        INSTANCE.counter--;
    }
}
