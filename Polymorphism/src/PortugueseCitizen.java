
public class PortugueseCitizen extends WorldCitizen {

    public PortugueseCitizen (String n)
    {
    super(n);            
    }
    
    public void nativeLangHello()
    {
    
    System.out.println("Olá meu nome é "+myName+ 
            ". Como posso ajudá-lo?");
    }
    
    
    public String toString()
    {
    return this.getClass().toString();
    }
}
