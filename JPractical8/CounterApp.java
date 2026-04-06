import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("0");
        label.setFont(new Font("Arial", Font.BOLD, 30));

        JButton upBtn = new JButton("Count Up");
        JButton downBtn = new JButton("Count Down");
        JButton resetBtn = new JButton("Reset");

        final int[] count = {0};

        upBtn.addActionListener(e -> {
            count[0]++;
            label.setText(String.valueOf(count[0]));
        });

        downBtn.addActionListener(e -> {
            count[0]--;
            label.setText(String.valueOf(count[0]));
        });

        resetBtn.addActionListener(e -> {
            count[0] = 0;
            label.setText("0");
        });

        frame.add(label);
        frame.add(upBtn);
        frame.add(downBtn);
        frame.add(resetBtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}