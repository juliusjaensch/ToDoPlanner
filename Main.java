import java.awt.BorderLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Meine To-Do-Liste");
        JButton button = new JButton("Aufgabe hinzufügen");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(button, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}