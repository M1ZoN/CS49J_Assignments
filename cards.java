package com.company;
import java.util.Hashtable;
import java.util.Scanner;

class Card {

    public Card(String strCard) {
        mRanks.put("A", "Ace");
        mRanks.put("K", "King");
        mRanks.put("Q", "Queen");
        mRanks.put("J", "Jack");
        mRanks.put("10", "Ten");
        mRanks.put("9", "Nine");
        mRanks.put("8", "Eight");
        mRanks.put("7", "Seven");
        mRanks.put("6", "Six");
        mRanks.put("5", "Five");
        mRanks.put("4", "Four");
        mRanks.put("3", "Three");
        mRanks.put("2", "Two");
        mRanks.put("1", "One");
        mSuits.put("D", "Diamonds");
        mSuits.put("H", "Hearts");
        mSuits.put("S", "Spades");
        mSuits.put("C", "Clubs");
        mCard = strCard;
    }

    public String getDescription() {
        String mRes = "Unknown";
        String strRank = mRanks.get(Character.toString(mCard.charAt(0)));
        String strSuit = mSuits.get(Character.toString(mCard.charAt(1)));

        if(mCard.length() == 2 && strRank != null && strSuit != null) {
            mRes = strRank + " of " + strSuit;
        }
        return (mRes);
    }

    private String mCard = "";
    private Hashtable<String, String>mRanks = new Hashtable<String, String>();
    private Hashtable<String, String>mSuits = new Hashtable<String, String>();
}

public class E5_19 {

    public static void main(String[] args) {
        System.out.print("Enter the card notation: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Card card = new Card(input);
        System.out.println(card.getDescription());
    }
}
