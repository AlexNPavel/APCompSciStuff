/**
 *
 * @author apavel
 */
public class CircleI extends GeoFigI{
    
    public CircleI(double r) {
        setRadius(r);
    }
    
    @Override
    public void getMetrics() {
        System.out.println("Shape: " + getClass().getName() +
                "\nRadius: " + df.format(getRadius()) +
                "\nArea: " + df.format(getArea()) + 
                "\nCircumference: " + df.format(getCircumference()) + "\n");
    }

    @Override
    public void reCalc() {
        double a,c;
        a = Math.PI*getRadius()*getRadius();
        setArea(a);
        c = Math.PI * 2 * getRadius();
        setCircumference(c);
    }
    
}
