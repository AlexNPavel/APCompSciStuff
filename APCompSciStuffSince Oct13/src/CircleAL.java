/**
 *
 * @author apavel
 */
public class CircleAL extends GeoFigAL{
    public CircleAL(int radius) {
        super();
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
    
    @Override
    public String toString() {
        return "Circle Class with Area " + getArea()+ " and Circumference " + getCircumference() + ".";
    }
    
}
