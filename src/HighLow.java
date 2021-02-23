import textio.TextIO;

public class HighLow {
    public static void main(String[] args){
        System.out.println("This program lets you play the simple card game,");
        System.out.println("HighLow. A card is dealt from a deck of cards.");
        System.out.println("You have to predict whether the next card will be");
        System.out.println("higher or lower. Your score in the game is the");
        System.out.println("number of correct predictions you make before");
        System.out.println("you guess wrong.");
        System.out.println();

        int gamesPlayed = 0;
        int sumOfScores = 0;

        double averageScore;

        boolean playAgain;

        do{
            int scoreThisGame;

            gamesPlayed++;
            System.out.print("Play again? ");
            playAgain = TextIO.getBoolean();

        }while(playAgain);
        averageScore = ((double)sumOfScores) / gamesPlayed;

        System.out.println();
        System.out.println("You played " + gamesPlayed + " games.");
        System.out.printf("Your average score was %1.3f. \n", averageScore);
    }

}
