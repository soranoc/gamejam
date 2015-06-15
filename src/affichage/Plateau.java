package affichage;

import grille.Grille;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import cells.Cellule;

public class Plateau extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Grille grille = new Grille();
	private String matiere;
	
	public Plateau(){
		this.setPreferredSize(new Dimension(360, 240));
		setLayout(new GridLayout(12, 18));
		for (int i = 0; i < grille.getGrille().length; i++) {
			for (int j = 0; j < grille.getGrille()[0].length; j++) {
				ajouterCellule(grille.getGrille()[i][j]);
			}
		}
		this.setVisible(true);
	}
	
	private void ajouterCellule(Cellule c){
		c.addMouseListener(new ListenerCellule(c, this));
        add(c);
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
}
