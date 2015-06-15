package affichage;

import grille.Grille;

import java.awt.GridLayout;

import javax.swing.JPanel;

import cells.Cellule;

public class Plateau extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Grille grille = new Grille();
	
	
	public Plateau(){
		this.setSize(360, 240);
		setLayout(new GridLayout(12, 18));
		for (int i = 0; i < grille.getGrille().length; i++) {
			for (int j = 0; j < grille.getGrille()[0].length; j++) {
				ajouterCellule(grille.getGrille()[i][j]);
			}
		}
	}
	
	private void ajouterCellule(Cellule c){
		c.addMouseListener(new ListenerCellule(c, this));
        add(c);
	}
}
