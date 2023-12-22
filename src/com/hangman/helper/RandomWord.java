package com.hangman.helper;

import java.util.Random;


public class RandomWord {
    private static final String[] ACTUAL_WORDS = {
        "ELEPHANT", "COMPUTER", "DIAMOND", "SUNSHINE", "CHAMPION",
        "FIREWORKS", "MOUNTAIN", "OCEAN", "WARRIOR", "VICTORY", 
        "ZEBRA", "LIONESS", "GALAXY", "TREASURE", "KINGDOM", 
        "HEROIC", "FANTASTIC", "JUPITER", "UNIVERSE", "EXCELLENT",
    };

    private final String ACTUAL_WORD;
    private final int LENGTH_OF_ACTUAL_WORD;
    private char[] guessedLetters; // e.g. "-----", "--E--". "C-EAR"
    

    public String getActualWord() {
            return ACTUAL_WORD;
        }

    
    public RandomWord() {
        // Initialize ACTUAL_WORD from ACTUAL_WORDS randomly
        this.ACTUAL_WORD = ACTUAL_WORDS[new Random().nextInt(ACTUAL_WORDS.length)];

        // Initialize constant LENGTH_OF_ACTUAL_WORD
        this.LENGTH_OF_ACTUAL_WORD = ACTUAL_WORD.length();

        // Initialize char array guessedLetters 
        this.guessedLetters = new char[LENGTH_OF_ACTUAL_WORD];
        for (int i = 0; i < LENGTH_OF_ACTUAL_WORD; i++) {
            guessedLetters[i] = '-';
        }
    }

    public void printGuessedLetters() {
        System.out.print("The word now looks like this: ");
        for (char c : guessedLetters) {
            System.out.print(c);
        }
        System.out.println();
    }

    public boolean updateGuessedLetters(char attemptingLetter) {

        boolean isContain = false;

        for (int i = 0; i < LENGTH_OF_ACTUAL_WORD; i++) {
            if (ACTUAL_WORD.charAt(i) == attemptingLetter) {
                guessedLetters[i] = attemptingLetter;
                isContain = true;
            }
        }
        return isContain;
    }

    public boolean isMatchGuessedLetters() {
        for (int i = 0; i < LENGTH_OF_ACTUAL_WORD; i++) {
            if (guessedLetters[i] != ACTUAL_WORD.charAt(i))
                return false;
        }
        return true;
    }

}
