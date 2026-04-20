import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextCounter extends JFrame implements KeyListener {

    JTextArea textArea;
    JLabel countLabel;

    TextCounter() {
        setTitle("Text Counter");
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Text Area
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.addKeyListener(this);

        // Scroll Pane (for better UI)
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Label for counts
        countLabel = new JLabel("Characters: 0  Words: 0");
        countLabel.setFont(new Font("Arial", Font.BOLD, 14));

        add(scrollPane, BorderLayout.CENTER);
        add(countLabel, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Update counts
    public void updateCounts() {
        String text = textArea.getText();

        int charCount = text.length();

        // Trim to avoid extra spaces
        String trimmed = text.trim();

        int wordCount = 0;
        if (!trimmed.isEmpty()) {
            wordCount = trimmed.split("\\s+").length;
        }

        countLabel.setText("Characters: " + charCount + "  Words: " + wordCount);
    }

    // KeyListener methods
    public void keyReleased(KeyEvent e) {
        updateCounts();
    }

    public void keyPressed(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new TextCounter();
    }
}