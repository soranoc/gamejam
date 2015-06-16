package affichage;

import grille.Grille;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import utils.Properties;
import cells.Cellule;


public class Plateau extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private Grille grille;
	private String matiere;
	
	/**
	 * Constructeur privé qui initialise le MouseListener
	 */
	private Plateau(){
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			/**
			 * Event de clic 
			 * 		On essaie de récupérer la Cellule à l'endroit du clique
			 * 			-> Si elle existe, on appelle la méthode 'mouseClicked' de la Cellule
			 * 			-> Si elle n'existe pas, on print l'exception
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				try{
					grille.getCellule(x/Cellule.SIZE,y/Cellule.SIZE).mouseClicked(e);					
				}
				catch(ArrayIndexOutOfBoundsException ex){
					System.err.println(ex.getMessage());
				}
			}
		});	
	}
	
	/**
	 * Constructeur du plateau
	 * @param grille
	 */
	public Plateau(Grille grille) {
		this();
		setPreferredSize(new Dimension(Properties.WIDTH*Properties.SIZE_CELLS, Properties.HEIGHT*Properties.SIZE_CELLS));
		this.setGrille(grille);
	}

	/**
	 * 
	 * @return grille de jeu
	 */
	public Grille getGrille() {
		return grille;
	}

	/**
	 * Modifie la grille de jeu
	 * @param grille
	 */
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	
	/**
	 * Methode d'affichage du Plateau
	 */
	@Override
	public void paint(Graphics g) {		
		for(int i = 0; i < grille.getWidth(); i++)
			for(int j = 0; j < grille.getHeight(); j++)
				grille.getCellule(i, j).paint(g);
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	

}
