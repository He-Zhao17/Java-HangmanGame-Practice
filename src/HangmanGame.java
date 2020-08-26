
import java.util.List;
import java.util.Random;

public class HangmanGame {
    // Add instance variables here.


/*
Complete this constructor. The input variable n refers to the number of incorrect guesses allowed.
When you are ready to read in potential words from a file, you should do it inside the constructor.
 */
    public HangmanGame(int n) {

    }
    /* This method takes as input a character, and returns true if the guessed character is present in the secret word.
        It also updates the mask to show the positions of this character in the secret word as marked.
     */

    public boolean checkGuess(char guess) {

    }

    /* this helper method returns true if the word has been completely guessed.
    (i.e. all elements of the mask are 1.
     */

    public boolean wordGuessed() {

    }

    /* this helper method will check to see if the input string is a
    letter that's already been guessed, or something other than a letter.
     */
    public boolean checkInput(String input) {

    }

    // Complete playGame()

    public boolean playGame() {
        int guessCount = 0;

        while (guessCount < nGuesses && !wordGuessed()) {
            //prompt for input

            // Check to see if it's correct.
            // Update the scoreboard, specifically the partialGuess and either the correct or incorrect letters.
            // if not, increment wrong guesses.
            // Display the scoreboard.

        }
        // If they won, print "Congratulations." and return true.
        // If they lost, print "Too bad.", show the correct word, and return false.


    }

 /*   Once you're ready to start testing the whole game, remove the main in Scoreboard.java and use this one.
    public static void main(String args[]) {
        // Prompt for the user's name.
        // Create a Player.
        // while not done:
        //      create a HangmanGame
        //      call playGame()
        //      increment the player's wins or losses
        // print their final score
    } */

}
