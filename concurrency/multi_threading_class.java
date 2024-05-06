public class multi_threading_class {

    public static void main(String[] args) {
        
        
        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " main thread");
        }
    }
}

class MyThread extends Thread {
    
    @Override
    public void run() {
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" ");
        }
    }
}


