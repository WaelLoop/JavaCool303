package JavaCool303;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class extends Cool303Box. it creates a Pastel themed box
 * @author waelalhashemi
 */
public class Cool303PastelBox extends Cool303Box{
    Cool303RoundPanel panel;
    /**
     * Constructor that initializes the inner panel to a round rectangle panel and adjust the sizes of each panel. Finally, it adds
     * the inner panel to the created pastel box
     */
    public Cool303PastelBox(){
        super();
        this.panel = new Cool303RoundPanel();
        this.panel.setLayout(new FlowLayout());
        this.panel.setBackground(new Color(255,255,186));
        this.setPreferredSize(new Dimension(225,225));
        this.panel.setPreferredSize(new Dimension(225,225));
        this.add(panel);
    }

    /**
     * adds a Cool303PastelButton to the box
     */
    public void addButton(){
        //3 columns and infinite number of rows
        int size = this.getPastelButtonSize();
        Cool303PastelButton button = new Cool303PastelButton( size +1);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button " + (size +1) + " is clicked");
            }
        });
        this.panel.add(button);
        this.addPastelButton(button);
    }

    /**
     * creates a round rectangle Box
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
        super.paintComponent(g);
    }

    /**
     * creates a round rectangle border.
     * @param g
     */
    @Override
    public void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
}
