import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener {

    JComboBox<String> colorBox;
    String[] colors = {"Select Color", "Red", "Green", "Blue", "Yellow", "White", "Gray"};

    ColorChanger() {
        setTitle("Background Color Changer");
        setSize(400, 300);
        setLayout(new FlowLayout());

        colorBox = new JComboBox<>(colors);
        colorBox.addActionListener(this);

        add(new JLabel("Choose Color:"));
        add(colorBox);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String selected = (String) colorBox.getSelectedItem();

        switch (selected) {
            case "Red":
                getContentPane().setBackground(Color.RED);
                break;
            case "Green":
                getContentPane().setBackground(Color.GREEN);
                break;
            case "Blue":
                getContentPane().setBackground(Color.BLUE);
                break;
            case "Yellow":
                getContentPane().setBackground(Color.YELLOW);
                break;
            case "White":
                getContentPane().setBackground(Color.WHITE);
                break;
            case "Gray":
                getContentPane().setBackground(Color.GRAY);
                break;
            default:
                getContentPane().setBackground(null);
        }
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}