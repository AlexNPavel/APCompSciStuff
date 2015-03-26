/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chronos
 */
public class Main {
    
    static Player player1;
    static Player player2;
    static Player player3;
    static Player player4;
    static Player player5;
    static Player player6;
    static Player player7;
    static Player[] players;
    
    public static void main(String args[]) throws InterruptedException {
        
        player1 = new Player("player1", new Random().nextInt(4000));
        player2 = new Player("player2", new Random().nextInt(4000));
        player3 = new Player("player3", new Random().nextInt(4000));
        player4 = new Player("player4", new Random().nextInt(4000));
        player5 = new Player("player5", new Random().nextInt(4000));
        player6 = new Player("player6", new Random().nextInt(4000));
        player7 = new Player("player7", new Random().nextInt(4000));
        
        players = new Player[7];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;
        players[4] = player5;
        players[5] = player6;
        players[6] = player7;
        
        ExecutorService threadExecutor = Executors.newCachedThreadPool();
        
        for(Player playing : players) {
            threadExecutor.execute(playing);
        }
        
        threadExecutor.shutdown();
        try{
            threadExecutor.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch(InterruptedException e) {
            System.out.println("ERROR");
        }
        
        System.out.println("End of main");
        
    }
}
