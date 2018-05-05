package JavaCool303;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This class extends JPanel. It creates a JPanel
 * @author waelalhashemi
 */
public abstract class Cool303Root extends JPanel {
    private ArrayList<Cool303SummerBox> summerBoxes = new ArrayList<Cool303SummerBox>();
    private ArrayList<Cool303PastelBox> pastelBoxes = new ArrayList<Cool303PastelBox>();


    /**
     * constructor that will set the layout of root to flowlayout
     */
    public Cool303Root(Cool303Theme theme){
        super();
        this.setLayout(new FlowLayout());
    }

    /**
     * add a Cool303SummerBox to the arrayList summerBoxes
     * @param box
     */
    public void addSummerBox(Cool303SummerBox box){
        this.summerBoxes.add(box);
    }

    /**
     * add a Cool303PastelBox to the arrayList PastelBoxes
     * @param box
     */
    public void addPastelBox(Cool303PastelBox box){
        this.pastelBoxes.add(box);
    }

    /**
     * return an arraylist of the summer boxes in the root
     * @return arrayList
     */
    public ArrayList<Cool303SummerBox> getSummerBoxes(){
        return this.summerBoxes;
    }
    /**
     * return an arraylist of the pastel boxes in the root
     * @return arrayList
     */
    public ArrayList<Cool303PastelBox> getPastelBoxes(){
        return this.pastelBoxes;
    }

}
