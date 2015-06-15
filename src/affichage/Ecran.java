package affichage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

import utils.Properties;

public class Ecran {
	public Ecran(){
		JFrame ecran = new JFrame("House on Tree");

		ecran.setPreferredSize(new Dimension(Properties.WIDTH*Properties.SIZE_CELLS,Properties.HEIGHT*Properties.SIZE_CELLS+120));
		ecran.setResizable(true);
		
		Plateau p = new Plateau();
		Selecteur s = new Selecteur(p);
		Selecteur s2 = new Selecteur(p);
		ecran.add(s, BorderLayout.NORTH);
		ecran.add(p);
		
		ecran.setLocationRelativeTo(null);
		ecran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ecran.pack();
		ecran.setVisible(true);
	}
}
