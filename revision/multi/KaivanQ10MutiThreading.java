package revision.multi;

import java.util.ArrayList;

import revision.polymorph.override;

import java.util.*;

public class KaivanQ10MutiThreading {

    static int i;

    public static void main(String[] args) {

        /*
         
         * Write a multithreaded program to print all odd positive numbers in ascending
           order up to n, where n is a positive integer number given as a command line
           argument. Instantiate requited number of threads, where each thread except
           the last, examines next 50 numbers and the last thread examines remaining
           numbers up to n. 
           (Dec-2015-OLD) [NLJIET] 07
                 
         */

        int n = new Scanner(System.in).nextInt();

        for (i = 1; i <= n;) {

            try {
                MyThread th = new MyThread(i, n);
                th.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            i = i + 50;
        }
        

    }
}

class MyThread extends Thread{
    private int i;
    private int j;
    private int n;

    MyThread(int i,int n) {
        this.i = i;
        this.n = n;
    }
    
    @Override
    public void run() {
        for (j = i; j <= i + 49 && j <= n; j++) {
            if (j % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+"  " +j);
            }
        }
    }

}