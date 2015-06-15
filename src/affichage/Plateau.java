package affichage;

import grille.Grille;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JPanel;

import utils.Properties;

public class Plateau extends JPanel{
	/**
	 * 
	 */
	public static final int WIDTH = 18;
	public static final int HEIGHT = 12;
	
	public static int SIZE_CELLS = 32;
	
	private static final long serialVersionUID = 1L;
	private Grille grille;
	private String matiere;
	
	public Plateau(){
		grille = new Grille();
		setPreferredSize(new Dimension(Properties.WIDTH*Properties.SIZE_CELLS,Properties.HEIGHT*Properties.SIZE_CELLS));
		
		GridLayout layout = new GridLayout(HEIGHT,WIDTH);
		setLayout(layout);
		
		
		
		for (int i = 0; i < grille.getHeight(); i++) {
			for (int j = 0; j < grille.getWidth(); j++) {
				System.out.println("[Plateau] Ajout "+grille.getGrille()[i][j] +" || "+grille.getGrille()[i][j].getPreferredSize());
				this.add(grille.getGrille()[i][j]);
			}
		}
		this.setVisible(true);
	}


	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.fillRect(0, 0, WIDTH*SIZE_CELLS, HEIGHT*SIZE_CELLS);
		
		for(int i = 0 ; i < grille.getWidth(); i++)
			for (int j = 0; j < grille.getHeight(); j++) {
				grille.getCellule(j, i).draw(g2d);
			}
		
	}
}
