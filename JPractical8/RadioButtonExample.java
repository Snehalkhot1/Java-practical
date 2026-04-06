import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        male.setBounds(50, 50, 100, 30);
        female.setBounds(150, 50, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JButton submit = new JButton("Submit");
        submit.setBounds(80, 100, 120, 30);

        JLabel result = new JLabel();
        result.setBounds(50, 140, 200, 30);

        submit.addActionListener(e -> {
            if (male.isSelected()) {
                result.setText("Selected: Male");
            } else if (female.isSelected()) {
                result.setText("Selected: Female");
            } else {
                result.setText("Please select gender");
            }
        });

        frame.add(male);
        frame.add(female);
        frame.add(submit);
        frame.add(result);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}