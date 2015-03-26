/**
 *
 * @author apavel
 */
public class Cylinder extends GeoFig{
    public Cylinder(int radius, int height) {
        super();
        this.radius = radius;
        this.height = height;
    }
    
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    
    public double getLatArea() {
        return height * 2 * Math.PI * radius;
    }
    
    public double getBaseArea() {
        return 2 * Math.PI * radius * radius;
    }
    
    public double getSurfArea(){
        return getLatArea() + getBaseArea();
    }
    
    @Override
    public String toString() {
        return "Cylinder Class with Surface Area " + getSurfArea() + ", Base Area " + getBaseArea() + ", Lateral Area " + getLatArea() + " and Volume " + getVolume() + ".";
    }
    
}
