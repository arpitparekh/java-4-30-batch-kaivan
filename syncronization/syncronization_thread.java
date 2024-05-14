public class syncronization_thread {

    public static void main(String[] args) {

        MainClass m = new MainClass();
        Thread1 th1 = new Thread1(m);
        th1.start();
        // MainClass m1 = new MainClass();
        Thread2 th2 = new Thread2(m);
        th2.start();
    }
}

class MainClass {
    
    // synchronized void loopFerav() {
    // for (int i = 0; i <= 10; i++) {
    // System.out.println(i+" : "+Thread.currentThread().getName());
    // }
    // }

    void loopFerav() {

        synchronized(this){
            for (int i = 0; i <= 10; i++) {
            System.out.println(i + "   :   " + Thread.currentThread().getName());
            }
        }
    }
}

class Thread1 extends Thread {

    MainClass m;

    public Thread1(MainClass m) {
        this.m = m;
    }

    @Override
    public void run() {
        m.loopFerav();
    }

}

class Thread2 extends Thread {
    MainClass m;

    public Thread2(MainClass m) {
        this.m = m;
    }

    @Override
    public void run() {
        m.loopFerav();
    }
}
