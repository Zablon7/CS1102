import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Demo extends JFrame{

    Demo(){
        ImageIcon image = new ImageIcon("src/icon.jpg");

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli", Font.ITALIC, 20));
        label.setIconTextGap(-10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100, 0, 250, 250); //set x,y position within frame as well as dimensions

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
    }
    public static void main(String[] args){
        new Demo();

    }
}
