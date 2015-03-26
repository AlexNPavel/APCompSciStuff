import java.util.Scanner;

public class Fibo {
	
    static int x;
    static int y;
    static int z;
    static int count;
	
    public static void main (String[] args) 
    {
        x = 1;
        y = 1;
        z = 0;
        
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter the place in the fibonacci sequence you wish to calculate: ");
        count = sc.nextInt();
        sc.close();
        if (count == 1) {
        	System.out.println("The value you requested is 1.");
        }
        else if (count == 2) {
        	System.out.println("The value you requested is 1.");
        }
        else if (count > 2) {
        	for (int i = 2; i < count; i++) {
        		z = x + y;
        		x = y;
        		y = z;
        	}
        	System.out.println("The value you requested is " + z);
        }
        else {
        	System.out.println("The value you requested is invalid.");
        }
    }
}
