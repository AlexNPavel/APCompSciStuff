/**
 *
 * @author apavel
 */
public class RectI extends GeoFigI {
   public RectI(double l, double w) {
        setLength(l);
        setWidth(w);
    }
    
    @Override
    public void getMetrics() {
        System.out.println("Shape: " + getClass().getName() +
                "\nLength: " + df.format(getLength()) +
                "\nWidth: " + df.format(getWidth()) + 
                "\nArea: " + df.format(getArea()) + 
                "\nPerimeter: " + df.format(getPerimeter()) + "\n");
    }

    @Override
    public void reCalc() {
        double a,p;
        a = getLength()*getWidth();
        setArea(a);
        p = 2*getWidth() + 2*getLength();
        setPerimeter(p);
    }
}
