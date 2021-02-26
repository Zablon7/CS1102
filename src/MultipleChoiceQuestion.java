import javax.swing.JOptionPane;

class MultipleChoiceQuestion extends Question {



        public MultipleChoiceQuestion(String query, String a, String b, String c, String d,String e, String answer){
            question = query+"\n";
            question += a + "\n";
            question += b + "\n";
            question += c + "\n";
            question += d + "\n";
            question += e;
            this.correctAnswer = answer.toUpperCase();
        }

        String ask() {
            String answer = JOptionPane.showInputDialog(question); //Stores answer in variable answer
            answer = answer.toUpperCase(); //Answer converted into uppercase

            // ask method checks for any invalid inputs from the user
            while (!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"))) {
                JOptionPane.showMessageDialog(null, "Invalid answer." +
                        " Please enter A, B, C, D, or E.");
                answer = JOptionPane.showInputDialog(question).toUpperCase();
            }
            //Our valid answer is returned to the check method
            return answer;
        }



}
