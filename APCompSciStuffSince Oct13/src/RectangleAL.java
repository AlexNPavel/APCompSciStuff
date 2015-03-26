/**
 *
 * @author apavel
 */
public class RectangleAL extends GeoFigAL {
    public RectangleAL(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
        return length*width;
    }
    
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
    
    @Override
    public String toString() {
        return "Rectangle Class with Area " + getArea() + " and Perimeter " + getPerimeter() + ".";
    }
    
}
