package affichage;

import grille.Grille;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Ecran extends JFrame{

	private static final long serialVersionUID = 1L;
	private static final Grille grille = new Grille();
	
	public Ecran() {
		super("Test plateau");
		setPreferredSize(new Dimension(600,800));
		
		setLayout(new BorderLayout());
		
		Plateau p= new Plateau(grille);
		add(new Selecteur(p), BorderLayout.NORTH);
		add(p);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ecran();
	}

}
