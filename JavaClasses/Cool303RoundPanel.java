package JavaCool303;

import javax.swing.*;
import java.awt.*;

/**
 * This class extends JPanel. it creates a Round rectangle panel.
 */
public class Cool303RoundPanel extends JPanel {
    /**
     * constructor
     */
    public Cool303RoundPanel(){
        super();
    }

    /**
     * creates a round rectangle panel
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    }

    /**
     * creates a round rectangle border.
     * @param g
     */
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getSize().width-1, getSize().height-1,20,20);
    }
}
