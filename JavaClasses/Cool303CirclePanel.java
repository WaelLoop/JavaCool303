package JavaCool303;

import javax.swing.*;
import java.awt.*;

/**
 * This class extends JPanel. it creates a circle looking Panel
 */
public class Cool303CirclePanel extends JPanel {
    /**
     * constructor
     */
    public Cool303CirclePanel() {
        super();
    }

    /**
     * creates circle looking panel
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);
        super.paintComponent(g);
    }

    /**
     * creates a circle border
     * @param g
     */
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width-1, getSize().height-1);
    }
}

