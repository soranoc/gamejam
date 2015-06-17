package affichage;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tuto {
	// TODO Terminer le tuto
	public Tuto() {
		JFrame frame = new JFrame("Tutoriel");
		frame.setPreferredSize(new Dimension(500, 500));
		JPanel pane = new JPanel();
		
		frame.add(pane);
		frame.pack();
		frame.setVisible(true);
	}
}
