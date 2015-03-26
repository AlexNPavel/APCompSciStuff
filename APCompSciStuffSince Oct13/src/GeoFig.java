import java.util.Random;

/**
 *
 * @author apavel
 */
public class GeoFig {
    public double length;
    public double width;
    public double height;
    public double radius;
    public double area;
    public double vol;
    public double latArea;
    public double surfArea;
    public double baseArea;
    public double sideCnt;
    public double slantHeight;
    public static Rectangle rect;
    public static Cylinder cyl;
    public static Circle circ;
    public static Sphere sphr;
    
    public static void main(String[] args) {
        rect = new Rectangle(new Random().nextInt(15) + 1, new Random().nextInt(15) + 1);
        cyl = new Cylinder(new Random().nextInt(15) + 1, new Random().nextInt(15) + 1);
        circ = new Circle(new Random().nextInt(15) + 1);
        sphr = new Sphere(new Random().nextInt(15) + 1);
        
        System.out.println("Printing with getter methods");
        System.out.println("Rectangle Class with Area " + rect.getArea() + " and Perimeter " + rect.getPerimeter() + ".");
        System.out.println("Cylinder Class with Surface Area " + cyl.getSurfArea() + ", Base Area " + cyl.getBaseArea() + ", Lateral Area " + cyl.getLatArea() + " and Volume " + cyl.getVolume() + ".");
        System.out.println("Circle Class with Area " + circ.getArea()+ " and Circumference " + circ.getCircumference() + ".");
        System.out.println("Sphere Class with Surface Area " + sphr.getSurfArea() + " and Volume " + sphr.getVolume() + ".");

        
        System.out.println("\nNow printing with .toString");
        System.out.println(rect.toString());
        System.out.println(cyl.toString());
        System.out.println(circ.toString());
        System.out.println(sphr.toString());
        
    }
     
}
