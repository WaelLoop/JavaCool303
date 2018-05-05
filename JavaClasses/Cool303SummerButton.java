package JavaCool303;
import java.awt.*;

/**
 * This class extends Cool303Button. it creates a Summer themed button
 * @author waelalhashemi
 */
public class Cool303SummerButton extends Cool303Button {
    /**
     * constructor
     * @param number
     */
    public Cool303SummerButton(int number){
        super(number);
    }

    /**
     * a function that creates a circle-looking Button with a Summer color.
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(new Color(142, 229, 63));
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width-1, getSize().height-1);
    }
}
