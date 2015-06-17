package affichage;

import grille.Pattern;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Test extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(900,900));
		
		Pattern pat = new Pattern(1);
		pat.setSize(new Dimension(200,200));
		pat.getExemple();
		pat.setBackground(Color.YELLOW);
		frame.getContentPane().add(pat);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
