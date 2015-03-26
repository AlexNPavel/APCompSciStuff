

import java.util.Arrays;


public class Dim2DArray {
   

int k[][] = {{3,6,9,3,7},{0,6,12,11,8},{2,5,7}};




public void prcTskA()
{


System.out.println("The contents of k before modification "+ 
Arrays.deepToString(k));


for (int[] h : k)
   for(int w = 0;w < h.length; w++)
     if(w%2 != 0)
	h[w] = h[w] * h[w];


System.out.println("The contents of k after modification "+ Arrays.deepToString
(k));



} // end prcTskA()   
    

public static void main(String args[])
{
Dim2DArray t = new Dim2DArray();
t.prcTskA();




}//end main
    
    
}//end class Dim2DArray