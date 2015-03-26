package Player;

public class Player implements Runnable {
    
    long sTime;
    String pName;
    
    public Player(String name, long time) {
        pName = name;
        sTime = time;
    }
    
    @Override
    public void run() {
        System.out.println("Player " + pName + " is going to sleep for " + sTime + " milliseconds.");
        try{
            Thread.sleep(sTime);
        }
        catch(InterruptedException ex) {
            System.out.println("Exception Caught");
        }
        System.out.println("Player " + pName + " is done sleeping.");
    }
    
}
