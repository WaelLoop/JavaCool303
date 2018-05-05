package JavaCool303;
import java.awt.*;

/**
 * This class extends Cool303Root. It creates a Pastel themed Root
 */
public class Cool303PastelRoot extends Cool303Root {
    /**
     * constructor that will set the background color to pastel looking color. In addition, the size is set to 225 by 225
     * @param theme
     */
    public Cool303PastelRoot(Cool303Theme theme){
        super(theme);
        this.setBackground(new Color(255,223,186));
        this.setPreferredSize(new Dimension(225,225));
    }

    /**
     * a function that resizes the window to a specific dimensions given the number of Cool303PastelBox in the root.
     * @param width
     * @param height
     */
    public void resizeRoot(int width,int height){
        int numberOfBoxes = this.getPastelBoxes().size();
        //225 is the width and the height of a single box
        if(225*numberOfBoxes > width){
            this.setPreferredSize(new Dimension(225*numberOfBoxes,225*numberOfBoxes));
        }
        else {
            this.setPreferredSize(new Dimension(width,height));
        }
    }

    /**
     * adds a Cool303PastelBox to the root that calls it.
     */
    public void addBox(){
        Cool303PastelBox box = new Cool303PastelBox();
        this.addPastelBox(box);
        this.add(box);
    }

    /**
     * creates a round rectangle looking panel
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }

    /**
     * creates a round rectangle looking border
     * @param g
     */
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getSize().width-1, getSize().height-1,15,15);
    }
}
