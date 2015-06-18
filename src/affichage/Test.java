package affichage;

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
		
		Robot r = new Robot();
		frame.getContentPane().add(r);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
