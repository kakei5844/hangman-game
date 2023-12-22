package com.hangman;

import java.util.Scanner;

import com.hangman.helper.InputValidator;
import com.hangman.helper.RandomWord;


public class HangmanGame {
    public static void main(String[] args) {
        
        final int MAX_ATTEMPTS = 8;

        // Start game
        System.out.println("Welcome to Hangman!");
        boolean isLost = false;
        boolean isWon = false;
        int attemptsLeft = MAX_ATTEMPTS;
        RandomWord randomWord = new RandomWord(); // Guess word initialisation
        Scanner scanner = new Scanner(System.in);

        while (!(isLost || isWon)) {

            // Display a new guess turn
            randomWord.printGuessedLetters();
            System.out.println("You have " + attemptsLeft + " guesses left.");
            System.out.print("Your guess: ");

            // Scan a new input
            String input = scanner.next();
            
            // Validate the input
            if (!InputValidator.isValid(input))
                continue;
            
            // Convert the input from String to UPPERCASE char
            char attemptingLetter = Character.toUpperCase(input.charAt(0));

            // If the guess is correct, guessedLetters will be updated
            if (randomWord.updateGuessedLetters(attemptingLetter)) {
                System.out.println("That guess is correct.");
                // Update isWon
                isWon = randomWord.isMatchGuessedLetters();
            }

            // If the guess is wrong, decrement attemptsLeft
            else {
                System.out.println("There are no " + attemptingLetter + "'s in the word.");
                attemptsLeft--;

                // Update isLost
                isLost = (attemptsLeft == 0);
            }   
        }

        scanner.close();

        // Win/lose message
        if (isWon)
            System.out.println("You guessed the word: " + randomWord.getActualWord());
        else {
            System.out.println("You' re completely hung.");
            System.out.println("The word was: " + randomWord.getActualWord());
        }
    }

}
