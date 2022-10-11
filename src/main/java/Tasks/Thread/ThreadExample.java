package Tasks.Thread;

class Table1 {
    synchronized void printTable(int n) {//method not synchronized, add synchronized in front to do so.
//        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
//        }
    }
}

class Mythread11 extends Thread {
    Table1 t;

    Mythread11(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Mythread21 extends Thread {
    Table1 t;

    Mythread21(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

class ThreadExample {
    public static void main(String[] args) {
        Table1 obj = new Table1();
        Mythread11 t1 = new Mythread11(obj);
        Mythread21 t2 = new Mythread21(obj);
        t1.start();
        t2.start();
    }
}
