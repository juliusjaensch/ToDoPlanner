package components;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class BorderComponent extends JLabel {
    public BorderComponent(String displayString) {
        super(displayString);
        setBorder(new LineBorder(Color.BLACK, 1));
        setBackground(Color.WHITE);
        setOpaque(true);
    }
}