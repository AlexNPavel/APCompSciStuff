package heap;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author apavel
 */
public class Dealer implements Runnable {
    
    String[] deck = new String[10];
    int cardsPlayed;
    Heap theHeap;
    
    public Dealer(Heap heap) {
        deck[0] = "2 of Spades";
        deck[1] = "3 of Clubs";
        deck[2] = "4 of Diamonds";
        deck[3] = "5 of Spades";
        deck[4] = "3 of Clubs";
        deck[5] = "5 of Diamonds";
        deck[6] = "6 of Spades";
        deck[7] = "2 of Clubs";
        deck[8] = "5 of Diamonds";
        deck[9] = "3 of Diamonds";
        theHeap = heap;
    }

    @Override
    public void run() {
        while (cardsPlayed < 10) {
            if(theHeap.getPlayerTook()) {
                try {
                    Thread.sleep((long) new Random().nextInt(2000));
                } catch (InterruptedException ex) {
                    System.out.println("Dealer Sleep Error!");
                }
                theHeap.putOnHeap(deck[cardsPlayed]);
                System.out.println("Put card "+ deck[cardsPlayed] + " on heap.");
                theHeap.setPlayerTook(false);
                cardsPlayed++;
            }
            while (!theHeap.getPlayerTook()) {
                System.out.println("Dealer Blocked");
                try {
                    Thread.sleep((long) new Random().nextInt(2000));
                } catch (InterruptedException ex) {
                    System.out.println("Dealer Sleep Error!");
                }
        }
//            System.out.print("");
//            while(!theHeap.playerTook) {}
        }

        System.out.println(toString());
    }
    
    
    
    @Override
    public String toString() {
        return "Dealer's hand is " + Arrays.toString(deck);
    }
    
}
