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
		JPanel pane = new JPanel();
		Plateau p= new Plateau(grille);
		pane.setLayout(new GridLayout(2,1));
		pane.add(p);
		pane.add(new Tronc());
		add(pane, BorderLayout.NORTH);
		add(new Selecteur(p), BorderLayout.SOUTH);
		
		//Test
		System.out.println(grille.getBranches()[0].getPoidsRestant());
		System.out.println(grille.getBranches()[1].getPoidsRestant());
		
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
