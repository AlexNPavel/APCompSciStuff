

public class Scp
{

int sides;
int dims;
int len;
int cnt;


public Scp(int v1, int v2)
{
sides = v1;
dims = v1+v2;
len = dims * dims;
}


public void tskA(int v1, int v2)
{
int sides = 0;
int dims = 0;
len = this.len - 19;

sides = v1 * v2;
dims = this.dims;
this.sides += v1;
cnt += dims + this.dims;
cnt = cnt + sides * this.sides / len;

System.out.println("TskA sides "+sides);
System.out.println("TskA dims "+dims);
}

public static void main(String arg[])
{
Scp w = new Scp(2, 5);
w.tskA(3, 7);
System.out.println("\nobj var sides = "+ w.sides);
System.out.println("obj var len  = " + w.len);
System.out.println("obj var dims  = " + w.dims);
System.out.println("obj var cnt  = " + w.cnt);
}

}//end class Scp