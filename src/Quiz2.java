import javax.swing.JOptionPane;

public class Quiz2 {
    public static void main(String[] args){
        String question = "Where was the first confirmed case of corona virus?\n";
        question += "A. China\n";
        question += "B. USA\n";
        question += "C. Russia\n";
        question += "D. Canada\n";
        question += "E. North Korea";
        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();
        while (true){

            // Correct answer
            if (answer.equals("A")){
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            }

            // Wrong answer
            else if(answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")){
                JOptionPane.showMessageDialog(null, "Wrong answer! Try Again.");
                answer = JOptionPane.showInputDialog(question);
            }

            // Answer out of scope of the program
            else{
                JOptionPane.showMessageDialog(null, "Your answer is not part of the choice. Try again!");
                answer = JOptionPane.showInputDialog(question);
            }
        }
    }
}
