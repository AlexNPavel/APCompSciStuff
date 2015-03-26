package Sep9;

/* This code demonstrates how a class can have a main method that instantiates objects from the class that contains the main method. 
*/
import java.util.Random;

public class SimpleObj
{

/******************************************************************
DEFINE FIELDS FOR THE CLASS IN THE TOP OF THE CLASS DEFINITION
*******************************************************************/    
    
// SimpleObj Fields

String name;
int myGenNbr;
int randVal;
int nsa;
int nsb;


//Static variables are class variables
static int genNbr;
static int sa;
static int sb;



/******************************************************************
DEFINE CLASS METHODS AFTER THE FIELD DECLARATIONS.
*******************************************************************/ 
// define methods

public SimpleObj(String nameParm, int rndParm)
{

name = nameParm;
myGenNbr = ++genNbr;
randVal = rndParm;

}//end constructor


public  void simpleObjSpk2()
{
// Static methods can only be accessed via the Class Name. An instantiated 
// object can invoke a static method. 
nsa += 3;
sa += 4;
System.out.println("I am a simple speak object method ");
}// end SimpleObjSpk()



public static void simpleObjSpk()
{
// Static methods can only be accessed via the Class Name. An instantiated 
// object can invoke a static method. 

//nsa += 3; //static method can not access a non-static class member. 
sa += 4;    
System.out.println("I am a static simple speak class method ");
}// end SimpleObjSpk()



public static void incVars01()
{
sa++;
sb++;
//nsa++; //static method can not access a non-static class member.
//nsb++; //static method can not access a non-static class member.

}// end incVars



public void incVars02()
{ // non-static methods can access both static and non-static members of a class.
sa++;
sb++;
nsa++;
nsb++;
}// end incVars

    @Override
public String toString()
{

return "My Name is "+ name + ". I am object nbr: " + myGenNbr +
	" and I received random value " + randVal;



}//end toStirng



/******************************************************************
DEFINE THE MAIN METHOD. A CLASS CONTAINS ONLY ONE MAIN METHOD
*******************************************************************/ 
public static void main(String[] args)
{
int range = 9000;
Random rndNbr = new Random();
int a = 10;
int b = 15; 
      

SimpleObj ob1 = new SimpleObj("Avil",rndNbr.nextInt(range) + 1);
SimpleObj ob2 = new SimpleObj("Katey",rndNbr.nextInt(range) + 1);
SimpleObj ob3 = new SimpleObj("Shamir",rndNbr.nextInt(range) + 1);
SimpleObj ob4 = new SimpleObj("Valir",rndNbr.nextInt(range) + 1);


System.out.println(ob1);
System.out.println(ob2);
System.out.println(ob3);
System.out.println(ob4+"\n\n");

for (int i = a*b;i>=0;i-=a+b)
System.out.println("Compound Assignment Statements works with variabls i = " + i);

System.out.println("\n\n");
SimpleObj.simpleObjSpk();
//simpleObjSpk2();

}
//end main





}//end class
