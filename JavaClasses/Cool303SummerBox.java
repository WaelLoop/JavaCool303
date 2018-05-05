package JavaCool303;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * This class extends Cool303Box. it creates a Summer themed box
 * @author waelalhashemi
 */
public class Cool303SummerBox extends Cool303Box{
    Cool303CirclePanel panel;

    /**
     * Constructor that initializes the inner panel to a circle panel and adjust the sizes of each panel. Finally, it adds
     * the inner panel to the created summer box
     */
    public Cool303SummerBox(){
        super();
        this.panel = new Cool303CirclePanel();
        this.panel.setLayout(new FlowLayout());
        this.panel.setBackground(new Color(101,147,245));
        this.setPreferredSize(new Dimension(225,225));
        this.panel.setPreferredSize(new Dimension(225,225));
        this.add(panel);
    }
    /**
     * adds a Cool303Summerbutton to the box
     */
    public void addButton(){
        //3 columns and infinite number of rows
        int size = this.getSummerButtonSize();
        Cool303SummerButton button = new Cool303SummerButton((size + 1));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button " + (size+1) + " is clicked");
            }
        });
        this.panel.add(button);
        this.addSummerButton(button);
        this.add(panel);

    }

    /**
     * creates a circle Box
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
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
