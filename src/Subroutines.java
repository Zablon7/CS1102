

public class Subroutines {
    public static void main(String[] args){
        GuessGame.playGame();
    }
    public static void playGame(){
        /*"public" and "static" are modifiers;
        "void" is the return-type; "playGame" is the subroutine-name;
        the parameter-list is empty
        ....Statements that define what playGame does go here;
         */
        System.out.println("Hello world!");
    }
    int getNextN(int N){
        /* There are no modifiers; "int" is the return-type;
        "getNextN" is the subroutine-name; the parameter-list
        includes one parameter whose name is "N" and whose
        type is "int".
        ....Statements that define what getNextN does go here
         */
        return N;
    }

    static boolean lessThan(double x, double y){
        /* "static" is a modifier; "boolean" is the return-type;
        "lessThan" is the subroutine-name;
        the parameter-list includes two parameters whose names are
        "x" and "y", and the type of each parameters is "double".
        ....Statements that define what lessThan does goes here.
         */
        return true;
    }

}

