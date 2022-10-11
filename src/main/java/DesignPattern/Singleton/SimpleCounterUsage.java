package DesignPattern.Singleton;

public class SimpleCounterUsage {
    public static void main(String[] args) {

        //Singleton with lazy loading inside threads



        //Singleton with lazy loading
        LazySimpleCounter counter = LazySimpleCounter.getInstance();
        counter.increment();
        System.out.println(counter.toString());

        //        Singleton eager with enum
        EnumSimpleCounter simpleCounter = EnumSimpleCounter.INSTANCE;
        simpleCounter.increment();
        System.out.println(simpleCounter.getCounter());

        EnumSimpleCounter simpleCounter1 = EnumSimpleCounter.INSTANCE;
        simpleCounter1.increment();
        System.out.println(simpleCounter1.getCounter());

        //Singleton eager with class
        EagerSimpleCounter counterA = EagerSimpleCounter.getInstance();
        counterA.increment();
        System.out.println(counterA.toString());




        EagerSimpleCounter counterB = EagerSimpleCounter.getInstance();
        counterB.increment();
        System.out.println(counterB.toString());

//        SimpleCounter counterC = new SimpleCounter();
    }
}
