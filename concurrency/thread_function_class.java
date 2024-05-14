public class thread_function_class {

    public static void main(String[] args) {

        // MyProcess process = new MyProcess();
        // Thread t1 = new Thread(process);
        // t1.start();

        // new Thread(new MyProcess()).start();
        // new Thread(new MyProcess()).start();

        // main thread

        AnotherProcess process = new AnotherProcess();
        process.startThread();

        // try{
        //     process.wait();
        // }catch (InterruptedException e) {
        //     System.out.println(e.getMessage());
        // }
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " main");
        }
        
    }
}

class MyProcess implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " runnable");
        }
    }
}

class AnotherProcess implements Runnable {

    Thread t1;

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            try {
                Thread.sleep(10);
                System.out.println(i + " runnable");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void startThread() {
        t1 = new Thread(this);
        t1.start();
    }

}
