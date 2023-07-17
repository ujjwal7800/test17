package com.aurionpro.test;

import java.util.Scanner;
public class LongestRepeatingSequence {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a string : ");
        String input = sc.next(); 
        findLongestRepeatingSequence(input);
    }

    public static void findLongestRepeatingSequence(String input) {
    	int maxCount = 0;
        int currentCount = 1;
        char maxChar = '\0';

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char prevChar = input.charAt(i-1);

            if (currentChar == prevChar) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxChar = prevChar;
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChar = input.charAt(input.length()-1);
        }

        String longestRepeatingCharacterSequence = "";
        for (int i = 0; i < maxCount; i++) {
            longestRepeatingCharacterSequence += maxChar;
        }
        
        System.out.println("Longest repeating character sequence : "+longestRepeatingCharacterSequence);
        System.out.println("Maximum number of times "+maxChar+" repeacted in sequence : "+maxCount);
    }
}

