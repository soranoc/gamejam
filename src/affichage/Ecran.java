package affichage;

import grille.Grille;

import java.awt.Dimension;

import javax.swing.JFrame;


public class Ecran extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public Ecran() {
		super("Test plateau");
		setPreferredSize(new Dimension(600,800));
		
		add(new Plateau(new Grille()));
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ecran();
	}

}
