package JavaCool303;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This class extends JFrame. it creates a JFrame
 */
public class Cool303Window extends JFrame {
    private ArrayList<Cool303PastelRoot> pastelRoots = new ArrayList<Cool303PastelRoot>();
    private ArrayList<Cool303SummerRoot> summerRoots = new ArrayList<Cool303SummerRoot>();


    /**
     * constructor that sets the size of the frame to 800 by 800 and set its layout to FlowLayout
     */
    public Cool303Window(){
        super();
        this.setSize(800,800);
        this.setLayout(new FlowLayout());
    }

    /**
     * adds a root to the window based on the theme.
     * @param theme
     */
    public void addRoot(Cool303Theme theme){
        if(theme.getTheme().equalsIgnoreCase("pastel")){
            Cool303PastelRoot root = new Cool303PastelRoot(theme);
            this.pastelRoots.add(root);
            this.add(root);
        }
        //summer theme
        else if(theme.getTheme().equalsIgnoreCase("summer")){
            Cool303SummerRoot root = new Cool303SummerRoot(theme);
            this.summerRoots.add(root);
            this.add(root);
        }

    }

    /**
     * displays the window(JFrame) with its content
     */
    public void display(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * return an arraylist of the summer roots in the window
     * @return arrayList
     */
    public ArrayList<Cool303SummerRoot> getSummerRoots(){
        return this.summerRoots;
    }
    /**
     * return an arraylist of the pastel roots in the window
     * @return arrayList
     */
    public ArrayList<Cool303PastelRoot> getPastelRoots(){
        return this.pastelRoots;
    }
}
