/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integral.calculator;

import java.text.DecimalFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class IntegralCalculator {
    
    static Threadable t1;
    static Threadable t2;
    static Threadable t3;
    static Threadable t4;
    static Threadable t5;
    static Threadable t6;
    static Threadable t7;
    static Threadable t8;
    static double pArea;
    static DecimalFormat df;
    
    public static synchronized void addArea(double area) {
        pArea += area;
    }

    public static void main(String[] args) throws InterruptedException {
        df = new DecimalFormat("#.####");
        long multiThreadTime;
        long singleThreadTime;
        long time;
        long endTime;
        double ll = 0;
        double hl = 2;
        double accuracy = 0.0000001;
        int nCores = Runtime.getRuntime().availableProcessors();
        ExecutorService threadRunner = Executors.newCachedThreadPool();
        time = System.nanoTime();
//        t1 = new Threadable(ll, hl, 0);
//        t2 = new Threadable(ll, hl, 1);
//        t3 = new Threadable(ll, hl, 2);
//        t4 = new Threadable(ll, hl, 3);
//        t5 = new Threadable(ll, hl, 4);
//        t6 = new Threadable(ll, hl, 5);
//        t7 = new Threadable(ll, hl, 6);
//        t8 = new Threadable(ll, hl, 7);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();
//        t5.join();
//        t6.join();
//        t7.join();
//        t8.join();
        for (int i = 0; i < nCores; i++) {
            threadRunner.execute(new Threadable(ll + (i)*((hl-ll)/nCores), ll + (i)*((hl-ll)/nCores) + ((hl-ll)/nCores) , nCores, i, accuracy));
        }
        threadRunner.shutdown();
        try {
            threadRunner.awaitTermination(45, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.out.println("ERROR");
        }
        endTime = System.nanoTime();
        System.out.println("Area = " + df.format(pArea) +"\nTime: " + ((endTime - time)/1000000) + " milliseconds\n\n");
        multiThreadTime = (endTime - time)/1000000;
        time = System.nanoTime();
        pArea = 0;
        for (double i = ll; i < hl; i += accuracy) {
            pArea += accuracy * Math.pow(i, 3);
        }
        System.out.println("Area "+df.format(pArea));
        endTime = System.nanoTime();
        System.out.println("Time: " + ((endTime - time)/1000000) + " milliseconds");
        singleThreadTime = (endTime - time)/1000000;
        System.out.println("\nScaling on " + nCores + " threads: " + ((double) singleThreadTime)/multiThreadTime);
    }
    
}