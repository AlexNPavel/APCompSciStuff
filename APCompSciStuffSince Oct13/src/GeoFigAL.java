import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author apavel
 */
public class GeoFigAL {
    private static ArrayList<GeoFigAL> shapes = new ArrayList<>();
    public double length;
    public double width;
    public double height;
    public double radius;
    private static int choice;
    public double area;
    public double vol;
    public double latArea;
    public double surfArea;
    public double baseArea;
    public double sideCnt;
    public double slantHeight;
    public static RectangleAL rect;
    public static CylinderAL cyl;
    public static CircleAL circ;
    public static SphereAL sphr;
    
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            choice = new Random().nextInt(4);
            switch(choice){
                case 0:
                    shapes.add(new RectangleAL(new Random().nextInt(15) +1, new Random().nextInt(15) +1));
                    break;
                case 1:
                    shapes.add(new CylinderAL(new Random().nextInt(15) +1, new Random().nextInt(15) +1));
                    break;
                case 2:
                    shapes.add(new CircleAL(new Random().nextInt(15) +1));
                    break;
                case 3:
                    shapes.add(new SphereAL(new Random().nextInt(15) + 1));
                    break;
            }
        }
        
        System.out.println("Printing with getter methods");
        for(int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i) instanceof RectangleAL) {
                System.out.println("Rectangle Class with Area " + ((RectangleAL) shapes.get(i)).getArea() + " and Perimeter " + ((RectangleAL) shapes.get(i)).getPerimeter() + ".\n");
            }
            else if(shapes.get(i) instanceof CylinderAL){
                System.out.println("Cylinder Class with Surface Area " + ((CylinderAL) shapes.get(i)).getSurfArea() + ", Base Area " + ((CylinderAL) shapes.get(i)).getBaseArea() + ", Lateral Area " + ((CylinderAL) shapes.get(i)).getLatArea() + " and Volume " + ((CylinderAL) shapes.get(i)).getVolume() + ".\n");
            }
            else if(shapes.get(i) instanceof CircleAL){
                System.out.println("Circle Class with Area " + ((CircleAL) shapes.get(i)).getArea()+ " and Circumference " + ((CircleAL) shapes.get(i)).getCircumference() + ".\n");
            }
            else if(shapes.get(i) instanceof SphereAL){
                System.out.println("Sphere Class with Surface Area " + ((SphereAL) shapes.get(i)).getSurfArea() + " and Volume " + ((SphereAL) shapes.get(i)).getVolume() + ".\n");
            }
        }

        System.out.println("\n\n\n\n\n\n\nNow printing with .toString");
        
        for(int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i) + "\n");
        }
    }
     
}
