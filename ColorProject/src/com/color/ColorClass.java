package com.color;
/*
Alexander Pavel

VERSION 01 -- STATIC & NON-STATIC PROGRAM EXERCISE

The objective of this project is to understand 
1) The behavior of static, non-static, and private fields.
2) The purpose of setter(or mutator) and getter methods.
*/

import java.util.Random;

public class ColorClass {
    public static enum COLORS {BLUE, GREEN, RED, PURPLE, GREY, ORANGE, YELLOW};
    private static int blueObjCnt;
    private static int greenObjCnt;
    private static int redObjCnt;
    private static int purpleObjCnt;
    private static int greyObjCnt;
    private static int orangeObjCnt;
    private static int yellowObjCnt;
    private int myInstantNbr;
    private int myColor;
    private int myRandNbr;
    
    public ColorClass(int color){
        this.setMyColor(color);
        this.setInstandNbr();
        this.setMyRandNbr();
    }
    
    private void setMyRandNbr() {
        myRandNbr = new Random().nextInt(546) + 1255;
    }
    
    public int getMyRandNbr() {
        return myRandNbr;
    }
    
    private void setInstandNbr(){
        switch (COLORS.values()[myColor].toString().toLowerCase()) {
            case "blue":
                myInstantNbr = blueObjCnt;
                break;
            case "green":
                myInstantNbr = greenObjCnt;
                break;
            case "red":
                myInstantNbr = redObjCnt;
                break;
            case "purple":
                myInstantNbr = purpleObjCnt;
                break;
            case "grey":
                myInstantNbr = greyObjCnt;
                break;
            case "orange":
                myInstantNbr = orangeObjCnt;
                break;
            case "yellow":
                myInstantNbr = yellowObjCnt;
                break;
            default:
                System.out.println("Set InstandNbr Error!");
                break;
        }
    }   
    
    public int getInstandNbr() {
        return myInstantNbr;
    }
    
    private void setMyColor(int color) {
        myColor = color;
        switch (COLORS.values()[myColor].toString().toLowerCase()) {
            case "blue":
                blueObjCnt++;
                break;
            case "green":
                greenObjCnt++;
                break;
            case "red":
                redObjCnt++;
                break;
            case "purple":
                purpleObjCnt++;
                break;
            case "grey":
                greyObjCnt++;
                break;
            case "orange":
                orangeObjCnt++;
                break;
            case "yellow":
                yellowObjCnt++;
                break;
            default:
                System.out.println("Set Color Count Error!");
                break;
        }
    }
    
    public String getMyColor() {       
        return COLORS.values()[myColor].toString();
    }
    
    public static int getColorCnt(String color) {
        switch (color.toLowerCase()) {
            case "blue":
                return blueObjCnt;
            case "green":
                return greenObjCnt;
            case "red":
                return redObjCnt;
            case "purple":
                return purpleObjCnt;
            case "grey":
                return greyObjCnt;
            case "orange":
                return orangeObjCnt;
            case "yellow":
                return yellowObjCnt;
            default:
                System.out.println("Get Color Cnt Error!");
                return -1;
        }
    }
    
    public static int getTotalObj() {
        return (blueObjCnt + greenObjCnt + redObjCnt + purpleObjCnt + greyObjCnt + orangeObjCnt + yellowObjCnt);
    }
    
    public static String getMaxObj() {
        int maxObjCnt = blueObjCnt;
        String maxObj = "Blue";
        if (greenObjCnt >= maxObjCnt) {
            if(greenObjCnt == maxObjCnt) {
                maxObj = maxObj + " and Green";
            }
            else {
                maxObj = "Green";
                maxObjCnt = greenObjCnt;
            }    
        }
        if (redObjCnt >= maxObjCnt) {
            if(redObjCnt == maxObjCnt) {
               maxObj = maxObj + " and Red";
            }
            else {
                maxObj = "Red";
                maxObjCnt = redObjCnt;
            } 
        }
        if (purpleObjCnt >= maxObjCnt) {
            if(purpleObjCnt == maxObjCnt) {
                maxObj = maxObj + " and Purple";
            }
            else {
                maxObj = "Purple";
                maxObjCnt = purpleObjCnt;
            } 
        }
        if (greyObjCnt >= maxObjCnt) {
            if(greyObjCnt == maxObjCnt) {
                maxObj = maxObj + " and Grey";
            }
            else {
                maxObj = "Grey";
                maxObjCnt = greyObjCnt;
            } 
        }
        if (orangeObjCnt >= maxObjCnt) {
            if(orangeObjCnt == maxObjCnt) {
                maxObj = maxObj + " and Orange";
            }
            else {
                maxObj = "Orange";
                maxObjCnt = orangeObjCnt;
            } 
        }
        if (yellowObjCnt >= maxObjCnt) {
            if(yellowObjCnt == maxObjCnt) {
                maxObj = maxObj + " and Yellow";
            }
            else {
                maxObj = "Yellow";
            } 
        }
        return maxObj;
    }
    
    public static String getMinObj() {
        int minObjCnt = blueObjCnt;
        String minObj = "Blue";
        if (greenObjCnt <= minObjCnt) {
            if(greenObjCnt == minObjCnt) {
                minObj = minObj + " and Green";
            }
            else {
                minObj = "Green";
                minObjCnt = greenObjCnt;
            }    
        }
        if (redObjCnt <= minObjCnt) {
            if(redObjCnt == minObjCnt) {
                minObj = minObj + " and Red";
            }
            else {
                minObj = "Red";
                minObjCnt = redObjCnt;
            } 
        }
        if (purpleObjCnt <= minObjCnt) {
            if(purpleObjCnt == minObjCnt) {
                minObj = minObj + " and Purple";
            }
            else {
                minObj = "Purple";
                minObjCnt = purpleObjCnt;
            } 
        }
        if (greyObjCnt <= minObjCnt) {
            if(greyObjCnt == minObjCnt) {
                minObj = minObj + " and Grey";
            }
            else {
                minObj = "Grey";
                minObjCnt = greyObjCnt;
            } 
        }
        if (orangeObjCnt <= minObjCnt) {
            if(orangeObjCnt == minObjCnt) {
                minObj = minObj + " and Orange";
            }
            else {
                minObj = "Orange";
                minObjCnt = orangeObjCnt;
            } 
        }
        if (yellowObjCnt <= minObjCnt) {
            if(yellowObjCnt == minObjCnt) {
                minObj = minObj + " and Yellow";
            }
            else {
                minObj = "Yellow";
            } 
        }
        return minObj;
    }
    
    public static void main(String[] args) {
        int iterations = new Random().nextInt(40) + 10;
        int one = new Random().nextInt(iterations);
        int two = new Random().nextInt(iterations);
        int three = new Random().nextInt(iterations);
        int four = new Random().nextInt(iterations);
        int five = new Random().nextInt(iterations);
        int six = new Random().nextInt(iterations);
        for (int i = 0; i < iterations; i++) {
            ColorClass g = new ColorClass(new Random().nextInt(ColorClass.COLORS.values().length));
            if (i == one) {
                System.out.println("The random number for iteration " + g.getInstandNbr() + " of " + g.getMyColor().toLowerCase() + " objects is " + g.getMyRandNbr() + ".");
            }
            else if (i == two) {
                System.out.println("The random number for iteration " + g.getInstandNbr() + " of " + g.getMyColor().toLowerCase() + " objects is " + g.getMyRandNbr() + ".");
            }
            else if (i == three) {
                System.out.println("The random number for iteration " + g.getInstandNbr() + " of " + g.getMyColor().toLowerCase() + " objects is " + g.getMyRandNbr() + ".");
            }
            else if (i == four) {
                System.out.println("The random number for iteration " + g.getInstandNbr() + " of " + g.getMyColor().toLowerCase() + " objects is " + g.getMyRandNbr() + ".");
            }
            else if (i == five) {
                System.out.println("The random number for iteration " + g.getInstandNbr() + " of " + g.getMyColor().toLowerCase() + " objects is " + g.getMyRandNbr() + ".");
            }
            else if (i == six) {
                System.out.println("The random number for iteration " + g.getInstandNbr() + " of " + g.getMyColor().toLowerCase() + " objects is " + g.getMyRandNbr() + ".");
            }
        }
        System.out.print("\nThere are " + ColorClass.getColorCnt("blue") + " blue objects, " + 
                ColorClass.getColorCnt("green") + " green objects, " +
                ColorClass.getColorCnt("red") + " red objects, " + 
                ColorClass.getColorCnt("grey") + " grey objects, " + 
                ColorClass.getColorCnt("purple") + " purple objects, " + 
                ColorClass.getColorCnt("orange") + " orange objects, and " +
                ColorClass.getColorCnt("yellow") + " yellow objects.\nThe max number of color objects are for " + 
                ColorClass.getMaxObj() + " objects and the minimum number of color objects are for " + ColorClass.getMinObj() + " objects. "
                + "\nThe total number of color objects instantiated is " + ColorClass.getTotalObj() + ".\n");
    }
}