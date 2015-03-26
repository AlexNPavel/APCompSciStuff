/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apavel
 */
public class SphereI extends GeoFigI{

    public SphereI(double r) {
        setRadius(r);
    }
    
    @Override
    public void getMetrics() {
        System.out.println("Shape: " + getClass().getName() +
            "\nRadius: " + df.format(getRadius()) +
            "\nSurface Area: " + df.format(getSurfArea()) + 
            "\nVolume: " + df.format(getVolume()) + "\n");
    }

    @Override
    public void reCalc() {
        double sa,v;
        sa = 4*Math.PI*getRadius()*getRadius();
        v = (4*Math.PI*getRadius()*getRadius()*getRadius())/3;
        setSurfArea(sa);
        setVolume(v);    
    }
    
}
