
# Hangman Game

This is a command-line implementation of the classic game Hangman, written in Java. The game randomly selects a word, and the player attempts to guess the word by suggesting letters. The player has a limited number of attempts before losing the game.



## Getting Started

To run the Hangman game, follow these steps:

1. Make sure you have Java Development Kit (JDK) installed on your system.
2. Download or clone the project repository from GitHub.
3. Open a terminal or command prompt and navigate to the project directory.



## Running the Game

Enter the following command to compile and run the game:

```
javac com/hangman/HangmanGame.java
java com.hangman.HangmanGame
```


## Gameplay

1. The game starts by displaying a welcome message.
2. You will see a series of underscores representing the letters in the word to be guessed.
3. You have a limited number of attempts to guess the word. The default is 8.
4. Enter a single letter as your guess and press Enter.
5. The game will provide feedback on whether your guess is correct or incorrect.
6. If your guess is correct, the corresponding underscore(s) will be replaced with the correct letter.
7. If your guess is incorrect, the number of attempts left will decrease.
8. Keep guessing letters until you either guess the word correctly or run out of attempts.
9. The game will display a win or lose message accordingly.

## Customization

You can modify the game by adjusting the following parameters in the `HangmanGame` class:

- `MAX_ATTEMPTS`: The maximum number of attempts allowed to guess the word.

## Dependencies

The game relies on two helper classes:

- `com.hangman.helper.InputValidator`: Validates the user's input to ensure it is a single letter.
- `com.hangman.helper.RandomWord`: Generates a random word for the game.

## Contributing

Contributions to this project are welcome. Feel free to open issues or submit pull requests to suggest improvements or add new features.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments

- The Hangman game is a classic word-guessing game enjoyed by many.
- This implementation was developed as a command-line version for educational purposes.