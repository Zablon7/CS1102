import textio.TextIO;

public class GuessGame {
    static int usersGuess;
    static int gamesWon;
    static int gamesPlayed;
    public static void main(String[] args) {
        System.out.println("Let's play a game. I'll pick a number between 1 and 10 and you try to guess it.");
        boolean playAgain;
        do{
            playGame();
            System.out.print("Would you like to play again? ");
            playAgain = TextIO.getlnBoolean();
        }while(playAgain);
        System.out.println("Games won: " + gamesWon);
        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Thanks for playing. Goodbye.");
    }

    static void playGame(){
        int computersNumber;

        int guessCount;
        computersNumber = (int) (10 * Math.random()) + 1;
        guessCount = 0;
        System.out.println();
        System.out.print("What is your first guess? ");
        while(true){
            usersGuess = TextIO.getInt();
            guessCount++;
            if (usersGuess == computersNumber){
                System.out.println("You got it in " + guessCount + " guesses!" +
                        " My number was " + computersNumber );
                gamesWon++;
                break;
            }
            if (guessCount==6){
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                break;
            }
            if (usersGuess < computersNumber){
                System.out.print("That's too low. Try again: ");
            }
            else if(usersGuess > computersNumber){
                System.out.print("That's too high. Try again: ");
            }
            System.out.println();
        }
        gamesPlayed++;
    }
}
