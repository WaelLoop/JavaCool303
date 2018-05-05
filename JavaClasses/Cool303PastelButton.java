package JavaCool303;
import java.awt.*;

/**
 * This class extends Cool303Button. It creates a Pastel themed button
 * @author waelalhashemi
 */
public class Cool303PastelButton extends Cool303Button{
    public Cool303PastelButton(int number){
        super(number);
    }

    /**
     * a function that creates a round rectangle looking Button with a Pastel color.
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(new Color(186,225,255));
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        super.paintComponent(g);
    }
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getSize().width-1, getSize().height-1,15,15);
    }
}
