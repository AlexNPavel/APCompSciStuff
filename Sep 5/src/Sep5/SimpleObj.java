/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sep5;

/**
 *
 * @author apavel
 */
public class SimpleObj {
    
    public static void SimpleObjTalk() {
        System.out.print("I am a simple object\n");
    }
    
    public static void SimpleObjTalk2() {
        System.out.println("I am an object member\n");
    }
    
    public static void main(String[] args) {
        System.out.print("I am a simple class\n");
//        SimpleObjTalk();
        SimpleObj obj1;
//        obj1 = new SimpleObj();
//        obj1.SimpleObjTalk();
        SimpleObjTalk2();
    }
    
}