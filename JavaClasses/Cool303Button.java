package JavaCool303;
import java.awt.*;
import javax.swing.*;

/**
 * This class extends JButton. It essentially creates a JButton.
 * @author walhas1
 *
 */
public abstract class Cool303Button extends JButton{
	/**
	 * The constructor. It sets the size of the button to 35 by 35. and removes the rectangular border from the button
	 */
	public Cool303Button(int number){
		super();
		setPreferredSize(new Dimension(35,35));
		setContentAreaFilled(false);
		setBorderPainted(false);
		this.add(new JLabel(""+number));
	}
}