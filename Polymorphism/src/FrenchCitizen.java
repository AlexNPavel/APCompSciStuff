/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apavel
 */
public class FrenchCitizen extends WorldCitizen{
    public FrenchCitizen (String n)
    {
    super(n);
            
    }
    
    public void nativeLangHello()
    {
    
    System.out.println("Bonjour je m'appelle "+ myName+ 
            ". Comment puis-je vous aider?");
    }
}
