//Alexander Pavel 
public class StrCncpt {
  
String s;

public StrCncpt()
{
    s = "temperature";
    System.out.println("The string is now --> "+ (s.substring(1, s.length()-2)).toUpperCase());   
}
public void caseCnvrt() {
    if (s.length() % 2 == 0) {
        int mid1 = s.length()/2;
        int mid2 = (int) (mid1 + 1);
        System.out.println(s.substring(0, mid1 - 1).toLowerCase() + s.substring(mid1 - 1, mid2).toUpperCase() + s.substring(mid2, s.length()).toLowerCase());
    }
    else if ((s.length() % 2) != 0) {
     int mid1 = (int) (s.length() / 2);
     System.out.println(s.substring(0, mid1).toLowerCase() + s.substring(mid1, mid1 + 1).toUpperCase() + s.substring(mid1 + 1, s.length()).toLowerCase());
    }
}
public static void main(String[] args) {
    StrCncpt str = new StrCncpt();
    str.caseCnvrt();
}
}