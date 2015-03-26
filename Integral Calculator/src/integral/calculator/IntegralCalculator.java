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

    public static void main(String[] args) throws InterruptedException {
        df = new DecimalFormat("#.####");
        double ll = 0;
        double hl = 2;
        int cores2 = Runtime.getRuntime().availableProcessors() * 2;
        ExecutorService threadRunner = Executors.newFixedThreadPool(cores2);
        long time = System.nanoTime();
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
        for (int i = 0; i < 8; i++) {
            threadRunner.execute(new Threadable(ll, hl, i));
        }
        threadRunner.shutdown();
        try {
            threadRunner.awaitTermination(45, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.out.println("ERROR");
        }
        System.out.println("Time: " + ((System.nanoTime() - time)/1000000) + " milliseconds\n");
        time = System.nanoTime();
        for (double i = ll; i < hl; i += 0.0000001) {
            pArea += 0.0000001 * Math.pow(i, 3);
        }
        System.out.println("run1 "+df.format(pArea));
        pArea = 0;
        for (double i = ll; i < hl; i += 0.0000001) {
            pArea += 0.0000001 * Math.pow(i, 4);
        }
        System.out.println("run2 "+df.format(pArea));
        pArea = 0;
        for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 5);
            }
        System.out.println("run3 "+df.format(pArea));
        pArea = 0;
        for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 6);
            }
        System.out.println("run4 "+df.format(pArea));
        pArea = 0;
        for (double i = ll; i < hl; i += 0.0000001) {
            pArea += 0.0000001 * Math.pow(i, 7);
        }
        System.out.println("run5 "+df.format(pArea));
        pArea = 0;
        for (double i = ll; i < hl; i += 0.0000001) {
            pArea += 0.0000001 * Math.pow(i, 8);
        }
        System.out.println("run6 "+df.format(pArea));
        pArea = 0;
        for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 9);
            }
        System.out.println("run7 "+df.format(pArea));
        pArea = 0;
        for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 10);
            }
        System.out.println("run8 "+df.format(pArea));
        System.out.println("Time: " + ((System.nanoTime() - time)/1000000) + " milliseconds");
    }
    
}