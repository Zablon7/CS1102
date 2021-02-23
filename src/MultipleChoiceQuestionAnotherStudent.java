import javax.swing.JOptionPane;



public class MultipleChoiceQuestionAnotherStudent {

    public static void main(String[] args){
        MultipleChoiceQuestionAnotherStudent bruh = new MultipleChoiceQuestionAnotherStudent(
                " What is a quiz\n",
                " idk\n",
                " ya you do\n",
                " do i tho\n",
                " I said yeah you do\n",
                " finee",
                "e"
        );
        bruh.check();


    }

    static int xQuestion = 0;

    static int xCorrect = 0;

    String quest;

    String correctAnswer;



    public MultipleChoiceQuestionAnotherStudent(String query, String a, String b, String c, String d, String e, String answer) {

        this.quest = query;

        this.quest += "nA. " + a;
        this.quest += "nB. " + b;

        this.quest += "nC. " + c;

        this.quest += "nD. " + d;

        this.quest += "nE. " + e;

        this.correctAnswer = answer.toUpperCase();

        }

        //ask method

    public String ask() {

            //ask the question

        String answer = JOptionPane.showInputDialog(quest);

        answer = answer.toUpperCase();



        while (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D")

                && !answer.equals("E")) {

            JOptionPane.showMessageDialog(null, "invalid answer please enter A,B,C,D or E");

            answer = JOptionPane.showInputDialog(quest);

            answer = answer.toUpperCase();

        }

        return answer;

    }



    public void check() {

        xQuestion++;



        String answer = ask();



        if (answer.equals(correctAnswer)) {

            JOptionPane.showMessageDialog(null, "Correct!");

            xCorrect++;

        } else {

            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);

        }

    }



    static void showResults() {

        JOptionPane.showMessageDialog(null, xCorrect + " correct out of " + xQuestion + " questions.");

    }

}



