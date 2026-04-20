import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame {

    JLabel timeLabel;
    JButton startBtn, stopBtn;

    int seconds = 0;
    Timer timer;

    SimpleTimer() {
        setTitle("Simple Timer");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Time display
        timeLabel = new JLabel("Time: 0 sec");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Buttons
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");

        add(timeLabel);
        add(startBtn);
        add(stopBtn);

        // Timer (fires every 1 second = 1000 ms)
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                timeLabel.setText("Time: " + seconds + " sec");
            }
        });

        // Start button action
        startBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        // Stop button action
        stopBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}