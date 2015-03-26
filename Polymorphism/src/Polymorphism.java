import java.util.ArrayList;
import java.util.Collections;

public class Polymorphism {
    public static void main(String args[])
    {
    
    ArrayList<WorldCitizen> cz = new ArrayList<>(); 
  
    cz.add(new FrenchCitizen("Jacque"));
    cz.add(new FrenchCitizen("Louis"));
    cz.add(new FrenchCitizen("Raoul"));
    cz.add(new FrenchCitizen("Marie"));
    cz.add(new PortugueseCitizen("Lee"));
    cz.add(new PortugueseCitizen("Marie"));
    cz.add(new PortugueseCitizen("Ralph"));
    cz.add(new PortugueseCitizen("Tina"));
    cz.add(new PortugueseCitizen("Henry"));
    
    Collections.shuffle(cz);
    for (int i = 0; i < cz.size();i++)
    {
       cz.get(i).englishHello();
       cz.get(i).nativeLangHello();
    }
}
}
