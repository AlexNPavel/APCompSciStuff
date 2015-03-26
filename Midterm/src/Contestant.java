import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alex Pavel
 */
public class Contestant extends Thread{
    
    int number;
    ArrayList<Integer> bucket;
    ArrayList<ArrayList> oldBuckets;
    PointsTray pTray;
    int roundNumber;
    
    public Contestant(PointsTray poTray, int numb, int rNumber) {
        pTray = poTray;
        bucket = new ArrayList();
        number = numb;
        roundNumber = rNumber;
    }
    
    @Override
    public void run() { 
        oldBuckets = new ArrayList();
        while(roundNumber >= pTray.getRound()) {
//            System.out.println("Round" + pTray.getRound() + "verify true");
            while(!pTray.inactive()) {
                try {
                    sleep(new Random().nextInt(2000) + 500);
                } catch (InterruptedException ex) {
                    System.out.println("Contestant Sleep Error");
                } 
                int newVal = pTray.takeValue(number);
                if (newVal != 0 && bucket != null) {
                    bucket.add(newVal);
                }
            }
        }
    }
    
    public ArrayList<Integer> buckets() {
        return bucket;
    }
    
    public int posCnt() {
        int posCnt = 0;
        for (int score : bucket) {
            if (score > 0) {
                posCnt++;
            }
        }
        return posCnt;
    }
    
    public void clear() {
        oldBuckets.add(bucket);
        bucket = new ArrayList();
    }
    
    public int totalScore() {
        int totScore = 0;
        for (Integer bucket1 : bucket) {
            totScore += bucket1;
        }
        return totScore;
    }
    
}
