import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Review {

    private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
    private static ArrayList<String> posAdjectives = new ArrayList<String>();
    private static ArrayList<String> negAdjectives = new ArrayList<String>();

    private static final String SPACE = " ";
    static{
        try {
            Scanner input = new Scanner(new File("cleanSentiment.csv"));
            while(input.hasNextLine()){
                String[] temp = input.nextLine().split(",");
                sentiment.put(temp[0],Double.parseDouble(temp[1]));
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }

        try {
            Scanner input = new Scanner(new File("positiveAdjectives.txt"));
            while(input.hasNextLine()){
                String temp = input.nextLine().trim();
                posAdjectives.add(temp);
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
        }   

        try {
            Scanner input = new Scanner(new File("negativeAdjectives.txt"));
            while(input.hasNextLine()){
                negAdjectives.add(input.nextLine().trim());
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }   
    }

    public static String textToString( String fileName )
    {  
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName+".txt"));

            while(input.hasNext()){
                temp = temp + input.next() + " ";
            }
            input.close();

        }
        catch(Exception e){
            System.out.println("Unable to locate " + fileName);
        }

        return temp.trim();
    }

    public static double sentimentVal( String word )
    {
        try
        {
            return sentiment.get(word.toLowerCase());
        }
        catch(Exception e)
        {
            return 0;
        }
    }

    public static String getPunctuation( String word )
    { 
        String punc = "";
        for(int i=word.length()-1; i >= 0; i--){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

 
    public static String removePunctuation( String word )
    {
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
        {
            word = word.substring(1);
        }
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
        {
            word = word.substring(0, word.length()-1);
        }

        return word;
    }

    public static String randomPositiveAdj()
    {
        int index = (int)(Math.random() * posAdjectives.size());
        return posAdjectives.get(index);
    }

    public static String randomNegativeAdj()
    {
        int index = (int)(Math.random() * negAdjectives.size());
        return negAdjectives.get(index);

    }


    public static String randomAdjective()
    {
        boolean positive = Math.random() < .5;
        if(positive){
            return randomPositiveAdj();
        } else {
            return randomNegativeAdj();
        }
    }

    public static String sentimentStar(String fileName) {
        return totalSentiment(fileName)+", "+starRating(fileName);
    }

    public static double totalSentiment(String fileName) {
        String s = textToString(fileName);
        double tot = 0;
        for (int i = s.indexOf(" "); i < s.length(); i = s.indexOf(" ", i+1)) {
            if (s.indexOf(" ", i+1) == -1) {
                tot += sentimentVal(removePunctuation(s.substring(i+1)));
                System.out.println(tot+s.substring(i+1));
                break;
            }
            tot += sentimentVal(removePunctuation(s.substring(i+1, s.indexOf(" ", i+1))));
        }
        System.out.println(Math.round(0.1)+" "+ Math.round(0.9));
        return (double)Math.round(tot*100)/100;
    }

    public static int starRating(String fileName) {
        if ((int)Math.abs(Math.round(totalSentiment(fileName)/5)) == 0) return 1;  
        return (int)Math.abs(Math.round(totalSentiment(fileName)/5));
    }

    public static String fakeReview(String fileName) {
        String s = textToString(fileName);
        while (s.indexOf("*") != -1) {
            if (totalSentiment(s) >= 0) {
                if (sentimentVal(removePunctuation(s.substring(s.indexOf("*")+1, s.indexOf(" ", s.indexOf("*"))))) <= 0) {
                    s = s.substring(0, s.indexOf("*")) +randomPositiveAdj()+ s.substring(s.indexOf(" ", s.indexOf("*")+1));
                } else s = s.substring(0, s.indexOf("*")) + s.substring(s.indexOf("*")+1);
            } else {
                if (sentimentVal(removePunctuation(s.substring(s.indexOf("*")+1, s.indexOf(" ", s.indexOf("*")))    )) >= 0) {
                    s = s.substring(0, s.indexOf("*")) +randomNegativeAdj()+ s.substring(s.indexOf(" ", s.indexOf("*")+1));
                } else s = s.substring(0, s.indexOf("*")) + s.substring(s.indexOf("*")+1);
            }
        }
        return s;
    }

    public static void e(int x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void longestStreak(String str) {
        int streak = 0;
        char letter = ' ';
        int current = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    current++;
                } else {
                    break;
                }
            }
            if (current > streak) {
                streak = current;
                letter = str.charAt(i);
            }
            current = 0;
        }
        System.out.println(letter + " " + streak);
    }
    
    public static int a(int round) {
        int result;
        if (round%3 == 0) result = 3; else if (round%2 == 0) result = 2; else result = 1;
        return result;
    }
}