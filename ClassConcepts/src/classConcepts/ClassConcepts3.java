package classConcepts;
/*
    Alexander Pavel

    This class is supposed to scramble the contents of the array tstArray
*/

import java.util.Arrays;

public class ClassConcepts3 {
    int tstArray[] = {1, 5, 3, 2, 6, 5, 4, 2};
    
    public ClassConcepts3() {
        System.out.print("The initial contents of the array are: ");
        System.out.println(Arrays.toString(tstArray) + ", ");
    }
    
    public void scrambleArray() {
       int inv = 1;
       for(int i = 0; i < tstArray.length; i++) {
           tstArray[i+inv] = tstArray[i];
           inv = -inv;
           System.out.println("After run "+(i+1)+" the array is "+Arrays.toString(tstArray));
       }
       System.out.print("\nThe scrambled contents of the array are ");
       for (int value : tstArray) {
           System.out.print(value + ", ");
       }
       System.out.println("");
    }
    
}
