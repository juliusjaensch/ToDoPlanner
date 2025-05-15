import components.DateComponent;
import java.awt.BorderLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Meine To-Do-Liste");
        JButton button = new JButton("Aufgabe hinzufügen");
        DateComponent dateComponent = new DateComponent(2001, 12, 12);
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(button, BorderLayout.NORTH);
        frame.add(dateComponent, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}