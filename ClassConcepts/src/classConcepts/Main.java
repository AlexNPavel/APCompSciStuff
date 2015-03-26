package classConcepts;

import java.util.Scanner;

/**
 *
 * @author apavel
 */
public class Main {
    public static void main(String[] args){
        int version = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which class do you wish to run? ");
        version = sc.nextInt();
        sc.close();
        switch(version){
            case 1:
                ClassConcepts1 test1 = new ClassConcepts1();
                test1.scrambleArray();
                break;
            case 2:
                ClassConcepts2 test2 = new ClassConcepts2();
                test2.scrambleArray();
                break;
            case 3:
                ClassConcepts3 test3 = new ClassConcepts3();
                test3.scrambleArray();
                break;
            default:
                System.out.println("Invalid case number");
        }            
    }
}
