import java.util.ArrayList;

/**
 *
 * @author Alex Pavel
 */
public class Main {
    
    static PointsMaker pMaker;
    static Contestant c01;
    static Contestant c02;
    static Contestant c03;
    static Contestant c04;
    static Contestant c05;
    static Contestant c06;
    static Contestant c07;
    static Contestant c08;
    static Contestant c09;
    static Contestant c10;
    static PointsTray poTray;
    static int rounds;
    
    public static void main(String[] args) {
        rounds = 10;
        poTray = new PointsTray();
        c01 = new Contestant(poTray, 1, rounds);
        c02 = new Contestant(poTray, 2, rounds);
        c03 = new Contestant(poTray, 3, rounds);
        c04 = new Contestant(poTray, 4, rounds);
        c05 = new Contestant(poTray, 5, rounds);
        c06 = new Contestant(poTray, 6, rounds);
        c07 = new Contestant(poTray, 7, rounds);
        c08 = new Contestant(poTray, 8, rounds);
        c09 = new Contestant(poTray, 9, rounds);
        c10 = new Contestant(poTray, 10, rounds);
        ArrayList<Contestant> contestants = new ArrayList();
        contestants.add(c01);
        contestants.add(c02);
        contestants.add(c03);
        contestants.add(c04);
        contestants.add(c05);
        contestants.add(c06);
        contestants.add(c07);
        contestants.add(c08);
        contestants.add(c09);
        contestants.add(c10);
        pMaker = new PointsMaker(poTray, contestants, rounds);
        pMaker.start();
        c01.start();
        c02.start();
        c03.start();
        c04.start();
        c05.start();
        c06.start();
        c07.start();
        c08.start();
        c09.start();
        c10.start();
    }
}
