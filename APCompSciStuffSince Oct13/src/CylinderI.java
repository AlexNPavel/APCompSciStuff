/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apavel
 */
public class CylinderI extends GeoFigI{

    public CylinderI(double r, double h) {
        setRadius(r);
        setHeight(h);
    }
    
    @Override
    void getMetrics() {
        System.out.println("Shape: " + getClass() +
                "\nRadius: " + df.format(getRadius()) +
                "\nHeight: " + df.format(getHeight()) + 
                "\nBase Area: " + df.format(getBaseArea()) +
                "\nLateral Area: " + df.format(getLatArea()) +
                "\nSurface Area: " + df.format(getSurfArea()) +
                "\nVolume: " + df.format(getVolume()) + "\n");    
    }

    @Override
    void reCalc() {
        double ba,la,sa,v;
        ba = 2*getRadius()*getRadius()*Math.PI;
        la = 2*Math.PI*getRadius()*getHeight();
        sa = ba + la;
        v = Math.PI*getRadius()*getRadius()*getHeight();
        setBaseArea(ba);
        setLatArea(la);
        setSurfArea(sa);
        setVolume(v);   
    }
    
}
