package com.company;
import java.util.Scanner;

public class E5_18
{
    public static void main(String[] args) {
        double nPercent = 0.01;
        Scanner sc = new Scanner(System.in);
        int nIncome = 0;
        int change[] = {50000, 25000, 25000, 150000, 250000};
        double total = 0;
        int i = 0;

        System.out.print("Please enter the amount of your income: ");
        nIncome = sc.nextInt();

        while (nIncome > 0) {

            if (nIncome - change[i] > 0)
                total += change[i] * nPercent;
            else
                total += nIncome * nPercent;
            nIncome -= change[i];
            if (i < 4)
                i++;
            if (nPercent < 0.06)
                nPercent+= 0.01;

        }

        System.out.println("The tax for your entered income is equal to " + total);
    }

    public static double testPercent(int nIncome) {
        double nPercent = 0.01;
        Scanner sc = new Scanner(System.in);
        int change[] = {50000, 25000, 25000, 150000, 250000};
        double total = 0;
        int i = 0;


        while (nIncome > 0) {

            if (nIncome - change[i] > 0)
                total += change[i] * nPercent;
            else
                total += nIncome * nPercent;
            nIncome -= change[i];
            if (i < 4)
                i++;
            if (nPercent < 0.06)
                nPercent+= 0.01;

        }

        return (total);
    }
}
