/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apavel
 */
public class PrismI extends GeoFigI{

    public PrismI(double r, double h, int n) {
        setRadius(r);
        setHeight(h);
        setNumberOfSides(n);
    }
    
    @Override
    public void getMetrics() {
        System.out.println("Shape: " + getClass().getName() +
                "\nNumber of Sides: " + df.format(getNumberOfSides()) +
                "\nBase Side Length: " + df.format(getSideLength()) +
                "\nBase Perimeter: " + df.format(getPerimeter()) + 
                "\nHeight: " + df.format(getHeight()) +
                "\nRadius: " + df.format(getRadius()) + 
                "\nApothem: " + df.format(getApothem()) +
                "\nCentral Angle: " + df.format(getCentralAngle()) +
                "\nBase Area: " + df.format(getBaseArea()) +
                "\nLateral Area: " + df.format(getLatArea()) +
                "\nSurface Area: " + df.format(getSurfArea()) +
                "\nVolume: " + df.format(getVolume()) + "\n");
        }

    @Override
    public void reCalc() {
        if (getNumberOfSides() > 0) {
            double sl,a,ba,la,sa,v,ca, p;
            sl = 2*getRadius()*Math.sin(Math.PI/getNumberOfSides());
            setSideLength(sl);
            a = getSideLength()/(2*Math.tan(Math.PI/getNumberOfSides()));
            setApothem(a);
            ba = getApothem()*getSideLength()*getNumberOfSides();
            setBaseArea(ba);
            la = getHeight()*getSideLength()*getNumberOfSides();
            setLatArea(la);
            sa = getLatArea()+getBaseArea();
            setSurfArea(sa);
            v = getBaseArea()*0.5*getHeight();
            setVolume(v);        
            ca = 360.0/getNumberOfSides();
            setCentralAngle(ca);
            p = sl*getNumberOfSides();
            setPerimeter(p);
        }
    }
    
}
