import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alex Pavel
 */
public class PointsMaker extends Thread {
    
    PointsTray pTray;
    ArrayList<Contestant> contestants;
    ArrayList<Integer> wins;
    ArrayList<Integer> totScores;
    int rounds;
    int minRound;
    int maxRound;
    
    public PointsMaker(PointsTray poTray, ArrayList<Contestant> c, int rNumber) {
        minRound = 4;
        maxRound = 8;
        pTray = poTray;
        contestants = c;
        wins = new ArrayList();
        for (Contestant contestant : contestants) {
            wins.add(0);
        }
        totScores = new ArrayList();
        for (Contestant contestant : contestants) {
           totScores.add(0);
        }
        rounds = rNumber;
    }
    
    @Override
    public void run() {
        int size = new Random().nextInt(maxRound - minRound) + minRound;
        int[] values = new int[size];
        pTray.reset(values, this);
        System.out.println("Round 1 started\n");
        while(pTray.getRound() < rounds + 2) {
            if (pTray.inactive()) {
                System.out.println("\n\n------------------------------------------------------------");
                System.out.println("Round "+(pTray.getRound() - 1)+" finished");
                System.out.println("------------------------------------------------------------");
                System.out.println("The tray's size was "+pTray.size());
                for (int i = 0; i < contestants.size(); i++) {
                    int posCnt = contestants.get(i).posCnt();
                    System.out.print("Contestant "+(i + 1)+" bucket values: "+contestants.get(i).buckets().toString());
                    System.out.println("    positive cnt: " + posCnt + "   Contest Score: " + contestants.get(i).totalScore());
                }
                ArrayList<Integer> highest = new ArrayList();
                highest.add(0);
                //Add total scores
                for (int i = 0; i < contestants.size(); i++) {
                    totScores.set(i, totScores.get(i) + contestants.get(i).totalScore());
                }
                for(int i = 1; i < contestants.size(); i++) {
//                    System.out.println("Contestant #"+(i + 1)+" being checked.");
                    if (contestants.get(i).totalScore() > contestants.get(highest.get(0)).totalScore()) {
                        highest = new ArrayList();
                        highest.add(i);
                    }
                    else if (contestants.get(i).totalScore() == contestants.get(highest.get(0)).totalScore()) {
                        highest.add(i);
                    }
                }
                System.out.println("\n\n------------------------------------------------------------");
                for (int i = 0; i < highest.size(); i++) {
                    if (i == 0) {
                        System.out.print("Contestant "+ (highest.get(i) + 1) +" is the winner of Round "+(pTray.getRound() - 1) 
                                + " with a score of "+ contestants.get(highest.get(0)).totalScore());
                        wins.set(highest.get(i), wins.get(highest.get(i))+1);
                        i++;
                    }
                    else {
                        wins.set(i, wins.get(i)+1);
                        System.out.print(" tied with contestant "+ (highest.get(i) + 1));
                    }
                }
                System.out.println("\n------------------------------------------------------------");
                System.out.println("\n\n");
                for(int i = 0; i < contestants.size(); i++) {
                    contestants.get(i).clear();
                }
                if (pTray.getRound() != rounds + 1) {
                    size = new Random().nextInt(maxRound - minRound) + minRound;
                    values = new int[size];
                    pTray.reset(values, this);
                    System.out.println("Round "+(pTray.getRound())+" started\n");
                }
                else {
                    pTray.addRound();
                }
            }
            else {
                try {
                    sleep(new Random().nextInt(1500) + 1000);
                } catch (InterruptedException ex) {
                    System.out.println("PointsMaker sleep error");
                }
            }
        }
        int roundsWinner = 0;
        int numberWins = 0;
        for (int i = 0; i < wins.size(); i++) {
            if (numberWins < wins.get(i)) {
                roundsWinner = i;
                numberWins = wins.get(i);
            }
        }
//        for (int i = 0; i < wins.size(); i++) {
//            System.out.println("Contestant " + (i + 1) + " had " + wins.get(i)+ " wins.");
//        }
        int scoresWinner = 0;
        int topScores = 0;
        for (int i = 0; i < totScores.size(); i++) {
            if (topScores < totScores.get(i)) {
                scoresWinner = i;
                topScores = totScores.get(i);
            }
        }
//        for (int i = 0; i < totScores.size(); i++) {
//            System.out.println("Contestant " + (i + 1) + " had a final score of " + totScores.get(i)+ ".");
//        }
        System.out.println("The contestant with the most wins was Contestant " + (roundsWinner + 1)
            + " with " + wins.get(roundsWinner) + " wins.");
        System.out.println("The contestant with the highest overall score was Contestant " + (scoresWinner + 1)
            + " with a final score of " + totScores.get(scoresWinner) + ".");
    }
}
