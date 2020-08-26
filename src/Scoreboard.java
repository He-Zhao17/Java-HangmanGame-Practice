/* Scoreboard.java
    This class will be used to display to the user
    the correctly and incorrectly guessed letters, as well as the solution so far.
 */

public class Scoreboard {
    // Add instance variables here.

 // Complete both constructors.
    public Scoreboard() {

    }
    public Scoreboard(String initialGuesses, String initialSolution) {

    }

    // Add accessors and mutators here. I've put in one to get you started.
    public String getCorrectGuesses() {
        return correctGuesses;
    }

// Print out the scoreboard for the user.
    public void display() {

    }

    // You can use this to test your scoreboard. You'll need to remove it once you're ready to run HangmanGame.

    public static void main(String[] args) {
        Scoreboard s1 = new Scoreboard();
        s1.display();
        Scoreboard s2 = new Scoreboard("ABC", "*A*B*C");
        s2.display();
    }

}

