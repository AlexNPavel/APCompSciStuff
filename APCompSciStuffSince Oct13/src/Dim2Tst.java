

import java.util.Arrays;

/**
 *
 * @author apavel
 */
public class Dim2Tst {
    static int[][] dim2 = {{1, 2},{3,4},{5,6}};
    int[][] dim2a,dim2b,dim2c;
    
    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(dim2));
        for (int i[] : dim2) {
            for(int h : i) {
                System.out.print(h*h*h+ ", ");
            }
        }
        System.out.println("");
    }//end main
    
}//end Dim2Tst