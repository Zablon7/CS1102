import javax.swing.*;

public abstract class Question{
    static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;
    abstract String ask();

    void check() {
        nQuestions++; // We count questions everytime the check method is called
        String answer = ask();
        if (answer.equals(this.correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++; // We count correct answers everytime the user is correct
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect." +
                    " The correct answer is " + this.correctAnswer + ".");
        }
    }


    void showResults(){
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " +
                +nQuestions + " questions.");
    }
}
