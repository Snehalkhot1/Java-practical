import java.awt.*;
import javax.swing.*;

public class Stopwatch extends JFrame {

    JLabel timeLabel;
    JButton startBtn, stopBtn, resetBtn;

    int hours = 0, minutes = 0, seconds = 0;
    boolean running = false;

    Thread thread;

    Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Time Label
        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));

        // Buttons
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        resetBtn = new JButton("Reset");

        add(timeLabel);
        add(startBtn);
        add(stopBtn);
        add(resetBtn);

        // Start Button
        startBtn.addActionListener(e -> start());

        // Stop Button
        stopBtn.addActionListener(e -> stop());

        // Reset Button
        resetBtn.addActionListener(e -> reset());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Start Thread
    public void start() {
        if (thread == null || !running) {
            running = true;

            thread = new Thread(() -> {
                while (running) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    seconds++;

                    if (seconds == 60) {
                        seconds = 0;
                        minutes++;
                    }

                    if (minutes == 60) {
                        minutes = 0;
                        hours++;
                    }

                    // Update UI
                    timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
                }
            });

            thread.start();
        }
    }

    // Stop Thread
    public void stop() {
        running = false;
    }

    // Reset Timer
    public void reset() {
        running = false;
        hours = minutes = seconds = 0;
        timeLabel.setText("00:00:00");
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}