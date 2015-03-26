import java.util.Random;

/**
 *
 * @author Alex Pavel
 */
public class PointsTray {
    
    int[] values;
    int round;
    volatile boolean inactive;
    PointsMaker pMaker;
    boolean give;
    
    public PointsTray() {
        round = 1;
        inactive = true;
    }   
    
    public void reset(int[] givenArray, PointsMaker poMaker) {
        values = givenArray;
        inactive = false;
        pMaker = poMaker;
        for (int i = 0; i < values.length; i++) {
            values[i] = new Random().nextInt(50) + 1;
        }
    }
    
    public void addRound() {
        round++;
    }
    
    public int getRound() {
        return round;
    }
    
    public int takeValue(int contestNumb) {
        int dasRound = getRound();
        int random = new Random().nextInt(values.length);
        int returnVal = 0;
//        System.out.println("takeVal run");
        if (values[random] > 0) {
            returnVal = values[random];
//            System.out.println("if "+returnVal);
//            values[random] = -10 * round;
            values[random] = -2;
        }
        else{
            returnVal = values[random];
//            System.out.println("else "+returnVal);
        }
        if (inactive()) {
            give = false;
        }
        else {
            give = true;
        }
        if (check()) {
//            System.out.println("Check Passed with array " +Arrays.toString(values));
        }
        else {
            if (!inactive()) {
                round++;
            }
            inactive = true;
        }
        if (give) {
            System.out.println("tray size = "+size()+" loc = "+random);
            if (returnVal > 0) {
                System.out.println("Contestant "+contestNumb+" takes pos val from loc "+random+" in round"+dasRound+"\n");
            }
            else {
                System.out.println("Contestant "+contestNumb+" takes neg val from loc "+random+" in round"+dasRound+"\n");
            }
            return returnVal;
        }
        else {
            return 0;
        }
    }
    
    boolean check() {
        boolean returnVal = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                returnVal = true;
                break;
            }
        }
        return returnVal;
    }
    
    public int size() {
        return values.length;
    }
    
    public boolean inactive() {
        return inactive;
    }
    
}
