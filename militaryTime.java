package com.company;

import java.util.Scanner;

public class E4_17 {

    public static void main(String[] args) {
        // write your code here
        int nFirstTime = 0;
        int nSecondTime = 0;
        int nFirstMinutes = 0;
        int nSecondMinutes = 0;
        int nResult = 0;
        int nMinInDay = 24 * 60;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first time: ");
        nFirstTime = sc.nextInt();
        System.out.print("Please enter the second time: ");
        nSecondTime = sc.nextInt();

        nFirstMinutes = calculateMinutes(nFirstTime);
        nSecondMinutes = calculateMinutes(nSecondTime);

        if (nFirstTime <= nSecondTime) {
            nResult = nSecondMinutes - nFirstMinutes;
        }
        else {
            nResult = nMinInDay - nFirstMinutes + nSecondMinutes;
        }
        System.out.println((nResult / 60) + " hours " + (nResult % 60) + " minutes.");
    }

    private static int calculateMinutes(int nMilitaryTime){
        return (nMilitaryTime % 100 + nMilitaryTime / 100 * 60);
    }
}
