/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integral.calculator;

import static integral.calculator.IntegralCalculator.df;

public class Threadable extends Thread{
    double ll;
    double hl;
    double pArea;
    int cores;
    int runs;
    double accuracy;
    
    public Threadable(double lowl, double highl, int core2, int run, double accuracy1) {
        ll = lowl;
        hl = highl;
        cores = core2;
        runs = run;
        accuracy = accuracy1;
    }
    
    @Override
    public void run() {
        for (double i = ll; i < hl; i += accuracy) {
            pArea += accuracy * Math.pow(i, 3);
        }
        IntegralCalculator.addArea(pArea);
    }
}
