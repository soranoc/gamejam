package affichage;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Ecran {
	public Ecran(){
		JFrame ecran = new JFrame("House on Tree");

		ecran.setPreferredSize(new Dimension(600,800));
		ecran.setResizable(true);
		ecran.setLayout(new GridLayout(3,1));
		
		Plateau p = new Plateau();
		Selecteur s = new Selecteur(p);
		ecran.add(s);
		ecran.add(p);
		
		ecran.setLocationRelativeTo(null);
		ecran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ecran.setVisible(true);
		ecran.pack();
	}
}
