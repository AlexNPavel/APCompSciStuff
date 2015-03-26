package heap;

/**
 *
 * @author apavel
 */
public class Main {
    public static Heap theHeap;
    
    public static void main(String[] args) {
        theHeap = new Heap();
        Thread dealer = new Thread(new Dealer(theHeap));
        Thread player = new Thread(new Player(theHeap));
        dealer.start();
        player.start();
    }
    
}
