/**
 *
 * @author apavel
 */
public class Sphere extends GeoFig{
    
    public Sphere(int radius) {
        super();
        this.radius = radius;
    }
    
    public double getSurfArea() {
        return 4 * Math.PI * radius * radius;
    }
    
    public double getVolume() {
        return (4/3) * Math.PI * radius * radius * radius; 
    }
    
    @Override
    public String toString() {
        return "Sphere Class with Surface Area " + getSurfArea() + " and Volume " + getVolume() + ".";
    }
    
}
