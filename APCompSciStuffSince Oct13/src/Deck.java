import java.util.Random;

public class Deck {
    int rankIndex;
    int suitIndex;
    int valueIndex;
    Card[] deck;
    int deckSize;
    String[] suits;
    String[] ranks;
    int[] values;
    
    public Deck() {
        this.suits = new String[4];
        suits[0] = "Clubs"; suits[1] = "Hearts"; suits[2] = "Diamonds"; suits[3] = "Spades";
        this.ranks = new String[13];
        ranks[0] = "Deuce"; ranks[1] = "Three"; ranks[2] = "Four"; ranks[3] = "Five"; ranks[4] = "Six"; ranks[5] = "Seven"; ranks[6] = "Eight";
        ranks[7] = "Nine"; ranks[8] = "Ten"; ranks[9] = "Jack"; ranks[10] = "Queen"; ranks[11] = "King"; ranks[12] = "Ace";
        this.values = new int[10];
        deck = new Card[50];
        for (int i = 0; i < deck.length; i++) {
            switch (suitIndex){
                    case 1:
            }    
            deck[i] = new Card("1","1",1);
        }
        deckSize = 50;
    }
    
    public int getDeckSize() {
        return deckSize;
    }
    
    public Card dealCard() {
        boolean notNull = false;
        Card theOne = deck[1];
        while(!notNull) {
            int card = new Random().nextInt(50);
            if (deck[card] != null) {
                theOne = deck[card];
                deck[card] = null;
                notNull = true;
            }
        }
        return theOne;
    }
    
    public static void main(String[] args) {
        
    }
    
}
