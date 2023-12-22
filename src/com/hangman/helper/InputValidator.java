package com.hangman.helper;

import java.util.ArrayList;


public class InputValidator {
    private static ArrayList<Character> attemptedLetters = new ArrayList<>();

    // =========== Private methods for the method isValid ===========

    private static boolean isChar(String input) {
        // Check if only one character is input
        if (input.length() == 1)
            return true;
        else {
            System.out.println("Invalid Character: input Only ONE character");
            return false;
        }
    }

    private static boolean isLetter(char attemptingLetter) {
        // Check if the input character is an English letter
        if (Character.isLetter(attemptingLetter))
            return true;
        else {
            System.out.println("Invalid Character: input an English character");
            return false;
        }
    }

    private static boolean alreadyAttempted(char attemptingLetter) {
        // Check if the letter has already been attempted
        if (attemptedLetters.contains(attemptingLetter)) {
            // Add the character into the ArrayList attemptedLetters 
            System.out.println("You' ve already attempted this letter before.");
            
            return true;
        }
        else {
            attemptedLetters.add(attemptingLetter);
            return false;
        }
    }

    // =========== The only public method in this class ===========
    public static boolean isValid(String input) {
        if (!isChar(input))
            return false;
        char attemptingLetter = Character.toUpperCase(input.charAt(0));
        return isLetter(attemptingLetter) && !alreadyAttempted(attemptingLetter);
    }

    
}
