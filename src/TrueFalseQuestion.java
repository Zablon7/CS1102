import javax.swing.*;

public class TrueFalseQuestion extends Question{

    TrueFalseQuestion(String question,String answer){
        super.question = "True or False: "+ question + "\n";
        super.correctAnswer = answer.toUpperCase();
    }

    String ask() {

            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
        while((!answer.equals("TRUE") && !answer.equals("FALSE") && !answer.equals("N") && !answer.equals("F") && !answer.equals("NO")
                && !answer.equals("T") && !answer.equals("Y") && !answer.equals("YES"))) {
            JOptionPane.showMessageDialog(null, "Invalid Answer. Please enter TRUE or FALSE");
            answer = JOptionPane.showInputDialog(question).toUpperCase();
        }
        if (answer.equalsIgnoreCase("F") || answer.equalsIgnoreCase("N")
                || answer.equalsIgnoreCase("NO") || answer.equalsIgnoreCase("FALSE")) {
            answer = "FALSE";
        }
        else {
            answer = "TRUE";
        }


        return answer;


    }
}
