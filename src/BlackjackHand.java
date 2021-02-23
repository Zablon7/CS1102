public class BlackjackHand extends Hand {
    public int getBlackjackValue(){
        int val;   // The value computed for the hand
        boolean ace;  // ace will be true of the hand contains an ace.

        int cards;  // Number of cards in the hand

        val = 0;
        ace = false;
        cards = getCardCount();  // (method defined in class Hand)

        for (int i = 0; i < cards; i++){
                // Add the value of the i-th card in the hand;
            Card card = new Card();  // The i-th card
            int cardVal;    //

            cardVal = card.getValue();
            if (cardVal > 10){
                cardVal = 10;       // For a Jack, Queen, or King.
            }
            if (cardVal == 1){
                ace = true;     // There is at least one ace.
            }
            val = val+ cardVal;
        }
        if (ace && val + 10 <=21){   // Using ace as 11 if the sum isnt over or equal to 21.
            val = val+10;
        }
        return val;

    }
}
