package revision.multi;
import java.util.*;
public class KaivanQ11MutiThreading {
    public static void main(String[] args) {
        
        /*
         * 
         * Write a complete multi-threaded program to meet following requirements: -
         * Read matrix [A] m x n - Create m number of threads - Each thread computes
         * summation of elements of one row, i.e. i th row of the matrix is processed by
         * i th thread. Where 0 <= i < m. - Print the results.
         * (Jun-2011-OLD)[NLJIET] 07
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array rows:");
        int m = sc.nextInt();
        
        System.out.print("Enter Array columns:");
        int n = sc.nextInt();

        System.out.println("Enter Elements:");
        int a[][] = new int[m][n];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {

            System.out.println(i + " " + m);

            OtherThread thread = new OtherThread(a, m, i);
            thread.start();
            // thread.join();

        }
        
        sc.close();
    }
}

class OtherThread extends Thread {
    private int arr[][];         // array
    private int m;              // 2
    private int i;              // 0

    OtherThread(int arr[][], int m, int i) {
        this.arr = arr;
        this.m = m;
        this.i = i;
    }
    
    @Override
    public void run() {
        int sum = 0;
        for (int j = 0; j < m; j++) { // 1 < 2+1
            sum = sum + arr[i][j];
        }
        System.out.println(Thread.currentThread().getName()+ " "+ sum);
        System.out.println("\n");
    }
    
}