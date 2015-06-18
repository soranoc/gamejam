package cells;

import grille.Grille;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import affichage.Ecran;

public abstract class Cellule {

	public static final int SIZE = 32;

	private int x, y;

	/**
	 * Constructeur par défaut {x : 0, y : 0}
	 */
	public Cellule() {
		this(0, 0);
	}

	/**
	 * Constructeur
	 * 
	 * @param x
	 * @param y
	 */
	public Cellule(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	/**
	 * @return Coordonnée X
	 */
	public int getX() {
		return x;
	}

	/**
	 * Modifie coordonnée X
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return Coordonnée Y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modifie Coordornnée Y
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return Coordonnée du pixel X (x * Cellule.SIZE)
	 */
	public int getPixelX() {
		return x * Cellule.SIZE;
	}

	/**
	 * @return Coordonnée du pixel Y (y * Cellule.SIZE)
	 */
	public int getPixelY() {
		return y * Cellule.SIZE;
	}

	public String toString() {
		return "Cellule [x=" + getX() + ", y=" + getY() + "]";
	}

	/**
	 * Méthode utiliser pour afficher la cellule
	 */

	public void paint(Graphics g) {
		Image img = new ImageIcon(getClass().getResource(this.getUrlImg()))
				.getImage();
		g.drawImage(img, getPixelX(), getPixelY(), Cellule.SIZE, Cellule.SIZE,
				null);
	}

	abstract public String getUrlImg();

	/**
	 * Méthode d'événement du clique sur la cellule
	 * 
	 * @param e
	 */
	public void mouseClicked(MouseEvent e) {
		System.out.println(this);
	}

	abstract public boolean isBranche();

	abstract public boolean isEmpty();

	abstract public boolean isBois();

	abstract public boolean isPierre();

	abstract public boolean isMetal();

	abstract public boolean isVerre();

	abstract public boolean isBloc();

	abstract public int getPoids();

	abstract public boolean isBase();

	public boolean isDispo() {
		if (isBranche()) {
			return false;
		}
		if (isUnderBranche()) {
			return false;
		}
		return true;
	}

	private boolean isUnderBranche() {
		for (int y = getY() - 1; y >= 0; --y) {
			if((Ecran.getGrille().getCellule(getX(), y).isBranche())){
				return true;
			}
		}
		return false;
	}

	public boolean isSupported() {
		if ((getX() == 8 || getX() == 9) && getY() == 11) {
			return true;
		}
		if (getY() >= Grille.HEIGHT - 1) {
			return false;
		}
		Cellule test = Ecran.getGrille().getCellule(getX(), getY() + 1);
		if (test.isBranche() || test.isBloc()) {
			return true;
		}
		return false;
	}
}
