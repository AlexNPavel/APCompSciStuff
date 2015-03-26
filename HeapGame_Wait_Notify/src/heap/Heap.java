package heap;

/**
 *
 * @author apavel
 */
public class Heap {
    
    String top;
    public boolean playerTook;
    
    public Heap() {
        playerTook = true;
    }
    
    public synchronized void putOnHeap(String card) throws InterruptedException {
        while(!playerTook) {
//            System.out.println("Dealer waiting");
            wait();
        }
        top = card;
        playerTook = false;
        notifyAll();
    }
    
    public synchronized String takeFromHeap() throws InterruptedException {
        while(playerTook) {
//            System.out.println("Player waiting");
            wait();
        }
        playerTook = true;
        notifyAll();
        return top;
    }   
}
