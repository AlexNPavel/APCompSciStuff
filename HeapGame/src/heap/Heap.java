package heap;

/**
 *
 * @author apavel
 */
public class Heap {
    
    String top;
    public volatile boolean playerTook;
    public boolean dealerHold;
    
    public Heap() {
        playerTook = true;
    }
    
    public synchronized void setPlayerTook(boolean took) {
        playerTook = took;
    }
    
    public synchronized boolean getPlayerTook() {
        return playerTook;
    }
    
    public synchronized void putOnHeap(String card) {
        top = card;
    }
    
    public synchronized String takeFromHeap() {
        return top;
    }
    
}
