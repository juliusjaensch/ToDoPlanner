package components;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class DayView extends JPanel  {

    public DayView() {
        setLayout(new GridLayout(24, 1));
        setBorder(BorderFactory.createTitledBorder("Tagesansicht"));

        for (int hour = 0; hour <= 23; hour++) {

            String timeText = String.format("%d:00 - %d:00", hour, hour+1);
            BorderComponent borderComponent = new BorderComponent(timeText);

            add(borderComponent);
        }
    }
}