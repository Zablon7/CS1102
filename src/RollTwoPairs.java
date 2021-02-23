

public class RollTwoPairs {
    public static void main(String[] args){
        PairOfDice dice1 = new PairOfDice();
        GraphicalDice dice2 = new GraphicalDice();
        PairOfDice dice = new PairOfDice();
        int countRolls = 0;
        int total1, total2;
        System.out.println();
        do{
            countRolls++;
            dice.setRoll();
            total1= dice.addDice();


            dice.setRoll();
            total2 = dice.addDice();

            System.out.println("The dice came up " + dice);
        }while(total1 != total2);
        /*do{
            dice1.setRoll();
            total1 = dice1.addDice();
            System.out.println("First pair comes up " + total1);

            dice2.setRoll();
            total2 = dice2.addDice();
            System.out.println("Second pair comes up " + total2);

            countRolls++;

            System.out.println();
        }while(total1 != total2);*/

        System.out.println();
        System.out.println("Winner! You got a double " + dice.addDice());
        System.out.println();
        System.out.println("You played " + countRolls + " times.");

    }
}



class PairOfDice{
    private int die1;
    private int die2;

    public String toString() {
        if(die1 == die2){
            return "double " + die1;
        }
        else{
            return die1 + " and " + die2;
        }
    }

    public PairOfDice(){
        roll();

    }

    protected void roll(){
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public void setRoll(){
        roll();
    }

    public int addDice(){
        return die1 + die2;
    }

}

