package heap;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author apavel
 */
public class Player implements Runnable {

    String[] hand;
    int runs;
    Heap theHeap;
    
    public Player(Heap heap) {
        hand = new String[10];
        theHeap = heap;
    }
    
    @Override
    public void run() {
        while (runs < 10) {
            try {
                Thread.sleep((long) new Random().nextInt(2000));
            } catch (InterruptedException ex) {
                System.out.println("Player Sleep Error!");
            }
            hand[runs] = theHeap.takeFromHeap();
            System.out.println("Took card " + hand[runs] + " from heap");
            runs++;
//            System.out.print("");
//            while(theHeap.playerTook) {}
        }
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Player's hand is " + Arrays.toString(hand);
    }
    
}
