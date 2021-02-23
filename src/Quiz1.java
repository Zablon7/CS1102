import javax.swing.JOptionPane;


public class Quiz1 {
    static int nQuestions = 0;
    static int nCorrect = 0;
    public static void main(String[] args){

        //Question one
        String question1 = "What is the first Java course at UoPeople?\n";
        question1 += "A. CS1101\n";
        question1 += "B. CS1102\n";
        question1 += "B. CS1103\n";
        question1 += "D. CS2203\n";
        question1 += "E. CS1104";
        check(question1, "B");

        //  Question Two
        String question2 = "Where is UoPeople located?\n";
        question2 += "A. Pasadena, California\n";
        question2 += "B. Baltimore, Maryland\n";
        question2 += "C. Tampa, Florida\n";
        question2 += "D. Los Angeles, California\n";
        question2 += "E. Fayetteville, North Carolina";
        check(question2, "A");

        // Question Three
        String question3 = "How many weeks has it been since you started CS1102?\n";
        question3 += "A. 4 weeks\n";
        question3 += "B. 2 weeks\n";
        question3 += "C. 6 weeks\n";
        question3 += "D. 5 weeks\n";
        question3 += "E. 3 weeks";
        check(question3, "E");

        // Final message with quiz results
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " +
                 + nQuestions + " questions.");
    }
    static String ask(String question){
        String answer = JOptionPane.showInputDialog(question); //Stores answer in variable answer
        answer = answer.toUpperCase(); //Answer converted into uppercase

        // ank method checks for any invalid inputs from the user
        while (!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"))){
            JOptionPane.showMessageDialog(null, "Invalid answer." +
                    " Please enter A, B, C, D, or E.");
            answer = JOptionPane.showInputDialog(question).toUpperCase();
        }
        //Our valid answer is returned to the check method
        return answer;
    }
    static void check(String question, String correctAnswer){
        nQuestions++; // We count questions everytime the check method is called
        String answer = ask(question);
        if (answer.equals(correctAnswer)){
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++; // We count correct answers everytime the user is correct
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect." +
                    " The correct answer is " + correctAnswer);
        }
    }
}
