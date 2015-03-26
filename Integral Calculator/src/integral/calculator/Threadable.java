/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integral.calculator;

import static integral.calculator.IntegralCalculator.df;

public class Threadable extends Thread{
    int eq;
    double ll;
    double hl;
    double pArea;
    
    public Threadable(double lowl, double highl, int equa) {
        eq = equa;
        ll = lowl;
        hl = highl;
    }
    
    @Override
    public void run() {
        if (eq == 0) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 3);
            }
            System.out.println("run1 " + df.format(pArea));
        }
        else if (eq==1) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 4);
            }
            System.out.println("run2 "+df.format(pArea));
        }
        else if (eq==2) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 5);
            }
            System.out.println("run3 "+df.format(pArea));
        }
        else if (eq==3) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 6);
            }
            System.out.println("run4 "+df.format(pArea));
        }
        else if (eq==4) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 7);
            }
            System.out.println("run5 "+df.format(pArea));
        }
        else if (eq==5) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 8);
            }
            System.out.println("run6 "+df.format(pArea));
        }        
        else if (eq==6) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 9);
            }
            System.out.println("run7 "+df.format(pArea));
        }
        else if (eq==7) {
            for (double i = ll; i < hl; i += 0.0000001) {
                pArea += 0.0000001 * Math.pow(i, 10);
            }
            System.out.println("run8 "+df.format(pArea));
        }
    }
}
