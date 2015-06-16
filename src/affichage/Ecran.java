package affichage;

import grille.Grille;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ecran extends JFrame{

	private static final long serialVersionUID = 1L;
	private static final Grille grille = new Grille();
	
	public Ecran() {
		super("House on Tree");
		setPreferredSize(new Dimension(575,800));
		setResizable(false);
		
		setLayout(new BorderLayout());
		JPanel degueulasse = new JPanel();
		Plateau p= new Plateau(grille);
		degueulasse.setLayout(new GridLayout(2,1));
		degueulasse.add(p);
		degueulasse.add(new Tronc());
		add(degueulasse, BorderLayout.NORTH);
		add(new Selecteur(p), BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public static Grille getGrille(){
		return grille;
	}
	
	public static void main(String[] args) {
		new Ecran();
	}

}
