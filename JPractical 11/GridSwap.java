import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridSwap extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[6];
    JButton firstSelected = null;

    GridSwap() {
        setTitle("GridLayout Swap Example");

        // 2 rows, 3 columns
        setLayout(new GridLayout(2, 3, 5, 5));

        // Create buttons 1 to 6
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        // First selection
        if (firstSelected == null) {
            firstSelected = clicked;
            clicked.setBackground(Color.YELLOW); // highlight
        }
        // Second selection → swap
        else {
            String temp = firstSelected.getText();
            firstSelected.setText(clicked.getText());
            clicked.setText(temp);

            firstSelected.setBackground(null);
            firstSelected = null;
        }
    }

    public static void main(String[] args) {
        new GridSwap();
    }
}