/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This program pops pictures up to the screen with music
//
//
////////////////////////////////////////

package ExtraCerdit;

import javax.swing.*;
import java.awt.*;

public class QuoteOptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame ("Pic Changer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		QuoteOptionsPanel panel = new QuoteOptionsPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
	}

}
