public class APOct10
{

int b;

int t[] = {1,7,13,20,37};


public APOct10()
{

b = 2;


}//end constructor


public void procTsk()
{

for (int i = t.length-1; i >= 1; i--)
{
System.out.print(t[i] % t[i-1] * t[i-1] / t[i] + ",");
}//end for
System.out.println("\n\n");
}//end procTsk

public static void main(String[] args) {
    APOct10 a = new APOct10();
    a.procTsk();
}



}//end APOct10