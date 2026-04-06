import javax.swing.*;
import java.awt.event.*;

public class ReverseNumber {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Enter Number:");
        label1.setBounds(20, 20, 100, 30);

        JTextField textField = new JTextField();
        textField.setBounds(130, 20, 120, 30);

        JButton button = new JButton("Reverse");
        button.setBounds(80, 70, 120, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(20, 120, 200, 30);

        button.addActionListener(e -> {
            String num = textField.getText();
            String rev = new StringBuilder(num).reverse().toString();
            result.setText("Result: " + rev);
        });

        frame.add(label1);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}