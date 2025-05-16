import components.DayView;
import java.awt.BorderLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Meine To-Do-Liste");
        DayView dayview = new DayView();
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(dayview, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}