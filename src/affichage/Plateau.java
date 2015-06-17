package affichage;

import grille.Grille;
import grille.Pattern;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import utils.Properties;
import cells.*;

public class Plateau extends JPanel {

	private static final long serialVersionUID = 1L;

	private Grille grille;
	private static String matiere = "bois";
	Pattern pat = new Pattern();


	/**
	 * Constructeur privé qui initialise le MouseListener
	 */
	private Plateau() {
		pat.getExemple();
		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			/**
			 * Event de clic On essaie de récupérer la Cellule à l'endroit du
			 * clique -> Si elle existe, on appelle la méthode 'mouseClicked' de
			 * la Cellule -> Si elle n'existe pas, on print l'exception
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();

				try {
					grille.getCellule(x / Cellule.SIZE, y / Cellule.SIZE)
							.mouseClicked(e);
					if (grille.getCellule(x / Cellule.SIZE, y / Cellule.SIZE).isDispo()) {
						if (matiere.equals("base")) {
							grille.setCellule(x / Cellule.SIZE, y
									/ Cellule.SIZE, new Base(x / Cellule.SIZE,
									y / Cellule.SIZE));
						} else if (matiere.equals("verre")) {
							grille.setCellule(x / Cellule.SIZE, y
									/ Cellule.SIZE, new Verre(x / Cellule.SIZE,
									y / Cellule.SIZE));
						} else if (matiere.equals("metal")) {
							grille.setCellule(x / Cellule.SIZE, y
									/ Cellule.SIZE, new Metal(x / Cellule.SIZE,
									y / Cellule.SIZE));
						} else if (matiere.equals("pierre")) {
							grille.setCellule(x / Cellule.SIZE, y
									/ Cellule.SIZE, new Pierre(
									x / Cellule.SIZE, y / Cellule.SIZE));
						} else if (matiere.equals("bois")) {
							grille.setCellule(x / Cellule.SIZE, y
									/ Cellule.SIZE, new Bois(x / Cellule.SIZE,
									y / Cellule.SIZE));
						}
					}
					if(!grille.isOkay()){
						System.out.println("Défaite");
					}
					else if(grille.containsBase()){
						if(grille.contains(pat)){
							System.out.println("Victoire!");
						}
					}
					repaint();
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.err.println(ex.getMessage());
				}
			}
		});
	}

	/**
	 * Constructeur du plateau
	 * 
	 * @param grille
	 */
	public Plateau(Grille grille) {
		this();
		setPreferredSize(new Dimension(
				Properties.WIDTH * Properties.SIZE_CELLS, Properties.HEIGHT
						* Properties.SIZE_CELLS));
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
	 * 
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
		for (int i = 0; i < grille.getWidth(); i++)
			for (int j = 0; j < grille.getHeight(); j++)
				grille.getCellule(i, j).paint(g);
	}

	public String getMatiere() {
		return matiere;
	}

	public static void setMatiere(String mat) {
		matiere = mat;
	}

}
