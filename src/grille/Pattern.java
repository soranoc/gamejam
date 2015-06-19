package grille;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import cells.Base;
import cells.Bois;
import cells.Cellule;
import cells.Metal;
import cells.Pierre;
import cells.Verre;
import cells.Vide;

public class Pattern extends JPanel {

	private static final long serialVersionUID = 1L;

	private int xBase;
	private int yBase;
	private int w = 4;
	private int h = 4;
	private Cellule[][] pattern;
	private Cellule[][] emptyPattern = new Cellule[4][4];
	private int nbEx;
	private boolean paintVide=false;

	public Pattern(int nbEx) {

		this.nbEx = nbEx;
		if (nbEx == 1 || nbEx == -2) {
			w = 3;
			h = 4;
		} else if (nbEx == 2 || nbEx ==-3) {
			w = 4;
			h = 4;
		} else if (nbEx == 3||nbEx ==-4) {
			w = 5;
			h = 6;
		}
		pattern = new Cellule[w][h];
		fill();
		getExemple();
	}

	private void fill() {
		for (int i = 0; i < w; ++i) {
			for (int j = 0; j < h; ++j) {
				pattern[i][j] = new Vide(i, j);
			}
		}
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				emptyPattern[i][j] = new Vide(i, j);
			}
		}

		repaint();
	}

	public void setCase(Cellule c) {
		pattern[c.getX()][c.getY()] = c;
	}

	public Cellule getCase(int x, int y) {
		return pattern[x][y];
	}

	public int getYBase() {
		return yBase;
	}

	public void setYBase(int yBase) {
		this.yBase = yBase;
	}

	public int getXBase() {
		return xBase;
	}

	public void setXBase(int xBase) {
		this.xBase = xBase;
	}

	public Cellule[][] getPattern() {
		return pattern;
	}

	public void setPattern(Cellule[][] pattern) {
		this.pattern = pattern;
	}

	public int placeGauche() {
		return getW() - (getW() - getXBase());
	}

	public int placeDroite() {
		return getW() - (getXBase() + 1);
	}

	public int placeHaut() {
		return getH() - (getH() - getYBase());
	}

	public int placeBas() {
		return getH() - (getYBase() + 1);
	}

	/**
	 * Crée un pattern qui correspond à l'exemple de grille
	 */
	private void getExemple() {
		if (nbEx == 1 || nbEx == -2) {
			this.setXBase(1);
			this.setYBase(3);

			this.setCase(new Bois(0, 1));
			this.setCase(new Metal(0, 2));
			this.setCase(new Metal(0, 3));

			this.setCase(new Bois(1, 0));
			this.setCase(new Bois(1, 1));
			this.setCase(new Verre(1, 2));
			this.setCase(new Base(1, 3));

			this.setCase(new Bois(2, 1));
			this.setCase(new Metal(2, 2));
			this.setCase(new Metal(2, 3));

			setPreferredSize(new Dimension(150, 230));

		} else if (nbEx == 2 || nbEx == -3) {
			this.setXBase(0);
			this.setYBase(3);
			this.setCase(new Bois(0, 1));
			this.setCase(new Pierre(0, 2));
			this.setCase(new Base(0, 3));

			this.setCase(new Bois(1, 0));
			this.setCase(new Bois(1, 1));
			this.setCase(new Pierre(1, 2));
			this.setCase(new Pierre(1, 3));

			this.setCase(new Bois(2, 0));
			this.setCase(new Bois(2, 1));
			this.setCase(new Verre(2, 2));
			this.setCase(new Pierre(2, 3));

			this.setCase(new Bois(3, 1));
			this.setCase(new Pierre(3, 2));
			this.setCase(new Pierre(3, 3));

			setPreferredSize(new Dimension(160, 230));

		} else if (nbEx == 3 || nbEx ==-4) {
			this.setXBase(2);
			this.setYBase(5);

			this.setCase(new Bois(0, 2));
			this.setCase(new Pierre(0, 3));
			this.setCase(new Pierre(0, 4));
			this.setCase(new Pierre(0, 5));

			this.setCase(new Bois(1, 1));
			this.setCase(new Bois(1, 2));
			this.setCase(new Verre(1, 3));
			this.setCase(new Pierre(1, 4));
			this.setCase(new Pierre(1, 5));

			this.setCase(new Bois(2, 0));
			this.setCase(new Bois(2, 1));
			this.setCase(new Bois(2, 2));
			this.setCase(new Pierre(2, 3));
			this.setCase(new Pierre(2, 4));
			this.setCase(new Base(2, 5));

			this.setCase(new Bois(3, 1));
			this.setCase(new Bois(3, 2));
			this.setCase(new Verre(3, 3));
			this.setCase(new Pierre(3, 4));
			this.setCase(new Pierre(3, 5));

			this.setCase(new Bois(4, 2));
			this.setCase(new Pierre(4, 3));
			this.setCase(new Pierre(4, 4));
			this.setCase(new Pierre(4, 5));

			setPreferredSize(new Dimension(170, 230));

		} else {
			setPreferredSize(new Dimension(170, 230));
		}

	}

	public int getW() {
		return w;
	}

	public void setW(int width) {
		this.w = width;
	}

	public int getH() {
		return h;
	}

	public void setH(int height) {
		this.h = height;
	}

	@Override
	public void paint(Graphics g) {
		if (paintVide==false) {
			for (int i = 0; i < pattern.length; i++) {
				for (int j = 0; j < pattern[0].length; j++) {
					pattern[i][j].paint(g);
				}
			}
		}else{
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					emptyPattern[i][j].paint(g);
				}
			}
		}
	}

	public Cellule[][] getEmptyPat() {
		return emptyPattern;
	}

	public void setEmptyPat(Cellule[][] emptyPattern) {
		this.emptyPattern = emptyPattern;
	}

	public boolean isPaintVide() {
		return paintVide;
	}

	public void setPaintVide(boolean paintVide) {
		this.paintVide = paintVide;
	}
	
	public void noDisplay(){
		setPaintVide(true);
	}
	
	public void display(){
		setPaintVide(false);
	}
	
	public Pattern getEmptyPattern(){
		return new Pattern(-1);
	}
}
