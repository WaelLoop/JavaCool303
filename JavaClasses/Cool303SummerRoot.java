package JavaCool303;

import java.awt.*;

/**
 * This class extends Cool303Root. It creates a summer themed Panel
 */
public class Cool303SummerRoot extends Cool303Root {
    /**
     * constructor that will set the background color to Summer looking color. In addition, the size is set to 225 by 225
     * @param theme
     */
    public Cool303SummerRoot(Cool303Theme theme){
        super(theme);
        this.setBackground(new Color(255,163,67));
        this.setPreferredSize(new Dimension(225,225));
    }

    /**
     * creates a circle looking root
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);
        super.paintComponent(g);
    }

    /**
     * creates a circle looking border
     * @param g
     */
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width-1, getSize().height-1);
    }

    /**
     * a function that resizes the window to a specific dimensions given the number of Cool303SummerBoxes in root alreadyv
     * @param width
     * @param height
     */
    public void resizeRoot(int width,int height){
        int numberOfBoxes = this.getSummerBoxes().size();
        if(225*numberOfBoxes > width){
            this.setPreferredSize(new Dimension(225*numberOfBoxes,225*numberOfBoxes));
        }
        else {
            this.setPreferredSize(new Dimension(width,height));
        }
    }

    /**
     * adds a Cool303SummerBox to the root that calls it.
     */
    public void addBox(){
        Cool303SummerBox box = new Cool303SummerBox();
        this.add(box);
        this.addSummerBox(box);
    }
}
