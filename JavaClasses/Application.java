import JavaCool303.*;

import java.awt.*;

/**
 * The main program that will use JavaCool303 library.
 */
public class Application {
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        //creating the window
        Cool303Window window = new Cool303Window();
        //adding the summer root to the window
        window.addRoot(new Cool303Summer("Summer"));
        //adding a summer box to summer root 0.
        window.getSummerRoots().get(0).addBox();
        //adding a string to the summer box 0 of summer root 0
        window.getSummerRoots().get(0).getSummerBoxes().get(0).addString("Box 1");
        //adding a background color to summer box 0 of summer root 0.
        window.getSummerRoots().get(0).getSummerBoxes().get(0).paintBackground(new Color(125,125,225));
        //adding 20 buttons to the summer box 0 of summer root 0
        for (int i = 0; i < 20; i++) {
            window.getSummerRoots().get(0).getSummerBoxes().get(0).addButton();
        }
        //resizing summer root 0
        window.getSummerRoots().get(0).resizeRoot(300,300);

        //adding the pastel root to the window
        window.addRoot(new Cool303Pastel("Pastel"));
        //adding a pastel box to pastel root 0.
        window.getPastelRoots().get(0).addBox();
        //adding a string to the pastel box 0 of pastel root 0
        window.getPastelRoots().get(0).getPastelBoxes().get(0).addString("Box 1");
        //adding a background color to pastel box 0 of pastel root 0.
        window.getPastelRoots().get(0).getPastelBoxes().get(0).paintBackground(new Color(150,100,150));
        //adding 20 buttons to the pastel box 0 of pastel root 0
        for (int i = 0; i < 20; i++) {
            window.getPastelRoots().get(0).getPastelBoxes().get(0).addButton();
        }
        //resizing pastel root 0
        window.getPastelRoots().get(0).resizeRoot(150,150);

        //display the window
        window.display();
    }
}
