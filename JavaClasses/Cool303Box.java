package JavaCool303;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


/**
 * The class extends JPanel. It essentially creates a JPanel
 * @author waelalhashemi
 *
 */
public abstract class Cool303Box extends JPanel{
	private ArrayList<Cool303PastelButton> pastelButtons = new ArrayList<Cool303PastelButton>();
	private ArrayList<Cool303SummerButton> summerButtons = new ArrayList<Cool303SummerButton>();
	/**
	 * constructor that creates the main panel and set the layout to borderLayout. In addition, the constructor
	 * adds space string to north, east, south and west to make it look pretty.
	 *
	 */
	public Cool303Box() {
		super();
		this.setLayout(new BorderLayout());
		//to make it look pretty
		this.add(new JLabel(" "),BorderLayout.EAST);
		this.add(new JLabel(" "),BorderLayout.NORTH);
		this.add(new JLabel(" "),BorderLayout.WEST);
		this.add(new JLabel(" "),BorderLayout.SOUTH);

	}
	/**
	 * Create a JLabel and display the string on the top left corner of the box if its present
	 * @param string
	 */
	public void addString(String string){
		JLabel label = new JLabel(string);
		Font font = new Font("Times New Roman",Font.BOLD,12);
		label.setFont(font);
		this.add(label,BorderLayout.NORTH);
	}

	/**
	 * add a Cool303SummerButton to the arrayList summerButtons
	 * @param button
	 */
	public void addSummerButton(Cool303SummerButton button){
		this.summerButtons.add(button);
	}

	/**
	 * add a Cool303PastelButton to the arrayList PastelButtons
	 * @param button
	 */
	public void addPastelButton(Cool303PastelButton button){
		this.pastelButtons.add(button);
	}

	/**
	 * return an arraylist of the summer buttons in the box
	 * @return arrayList
	 */
	public ArrayList<Cool303SummerButton> getSummerButtons(){
		return this.summerButtons;
	}
	/**
	 * return an arraylist of the summer buttons in the box
	 * @return arrayList
	 */
	public ArrayList<Cool303PastelButton> getPastelButtons(){
		return this.pastelButtons;
	}

	/**
	 * return an the size of the arrayList summerButtons in the box
	 * @return int
	 */
	public int getSummerButtonSize(){
		return this.summerButtons.size();
	}
	/**
	 * return an the size of the arrayList PastelButtons in the box
	 * @return int
	 */
	public int getPastelButtonSize(){
		return this.pastelButtons.size();
	}

	/**
	 * abstract methods that adds a button to the respective box
	 */
	abstract void addButton();

	/**
	 * changes the background color of panel
	 * @param color
	 */
	public void paintBackground(Color color){
		this.setBackground(color);
	}
}
