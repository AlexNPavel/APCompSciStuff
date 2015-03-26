
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author apavel
 */
public abstract class GeoFigI {
    private double perimeter,circumference,length, width, radius, height, area, vol, latArea, surfArea, baseArea,slantHeight,apothem,centralAngle;
    private int sideCnt;
    public static DecimalFormat df;
    static ArrayList<GeoFigI> shapes = new ArrayList<>();
    public static PrismI p = new PrismI(3, 5, 7);
    public static void main(String[] args) {
        df = new DecimalFormat("#.##");
        p.getMetrics();
        int rand;
        for(int i = 0; i < 50; i++) {
            rand = new Random().nextInt(4);
            switch(rand) { 
                case 1:
                    shapes.add(new CircleI(new Random().nextDouble() * 20 + 1));
                    break;
                case 2:
                    shapes.add(new RectI(new Random().nextDouble() * 20 + 1, new Random().nextDouble() * 20 + 1));
                    break;
                case 3:
                    shapes.add(new PrismI(new Random().nextDouble() * 20 + 1, new Random().nextDouble() * 20 + 1, new Random().nextInt(9) +  3));
                    break;
                case 4:
                    shapes.add(new SphereI(new Random().nextDouble() * 20 + 1));
                    break;
                case 5:
                    shapes.add(new CylinderI(new Random().nextDouble() * 20 + 1, new Random().nextDouble() * 20 + 1));
                    break;
            }
        }
        for(int i = 0; i < shapes.size(); i++) {
            shapes.get(i).getMetrics();
        }
        System.out.println("\nNumber of 3D Shapes: "+getNumberOf3DShapes());
        System.out.println("The metrics of the object with the greatest volume are: \n");
        shapes.get(maxVolume()).getMetrics();
    }
    
    abstract void getMetrics();
    abstract void reCalc();
    
    public static double getNumberOf3DShapes() {
        int n = 0;
        for(int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getVolume() != 0) {
                n++;
            }
        }
        return n;
    }
    
    public static int maxVolume() {
        int index = 0;
        double volume = 0;
        for(int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getVolume() > volume) {
                index = i;
                volume = shapes.get(i).getVolume();
            }
        }
        return index;
    }
    
    public double getRadius() { return radius; }
    public double getArea() { return area; }
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getLatArea() { return latArea; }
    public double getBaseArea() { return baseArea; }
    public double getSurfArea() { return surfArea; }
    public double getVolume() { return vol; }
    public int getNumberOfSides() { return sideCnt; }
    public double getApothem() { return apothem; }
    public double getSideLength() { return length; }
    public double getPerimeter() { return perimeter; }
    public double getCircumference() { return circumference; }
    public double getCentralAngle() { return centralAngle; }
    
    public void setRadius(double r) {
        radius = r;
        reCalc();
    }
    public void setArea(double a) {
        area = a;
    }
    public void setLength(double l) {
        length = l;
        reCalc();
    }
    public void setWidth(double w) {
        width = w;
        reCalc();
    }
    public void setHeight(double h) {
        height = h;
        reCalc();
    }
    public void setBaseArea(double a) {
        baseArea = a;
    }
    public void setLatArea(double a) {
        latArea = a;
    }
    public void setSurfArea(double a) {
        surfArea = a;
    }
    public void setVolume(double v) {
        vol = v;
    }
    public void setNumberOfSides(int s) {
        sideCnt = s;
        reCalc();
    }
    public void setApothem(double a) {
        apothem = a;
    }
    public void setSideLength(double l) {
        length = l;
    }
    public void setPerimeter(double p) {
        perimeter = p;
    }
    public void setCircumference(double c) {
        circumference = c;
    }
    public void setCentralAngle(double a) {
        centralAngle = a;
    }
}
