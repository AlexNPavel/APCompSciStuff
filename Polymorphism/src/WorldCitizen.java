

public abstract class WorldCitizen {
    String myName;
    
    public WorldCitizen(String n)
    {
    myName = n;
    }
    
    public void englishHello()
    {
    System.out.println("Hello. My name is "+myName+
            ". I speak English. Can I help you? ");
  
    }
    
    public abstract void nativeLangHello();
    
}
