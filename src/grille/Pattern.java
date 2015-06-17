package grille;

import java.awt.Graphics;

import javax.swing.JPanel;

import cells.Base;
import cells.Bois;
import cells.Cellule;
import cells.Metal;
import cells.Pierre;
import cells.Verre;
import cells.Vide;

public class Pattern extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xBase;
	private int yBase;
	private int width;
	private int height;
	private Cellule[][] pattern;
	private int nbEx;

	public Pattern(int nbEx){
		this.nbEx=nbEx;
		if (nbEx==1){
			width=3;
			height=4;
		}
		else if (nbEx ==2){
			width=4;
			height=4;
		}
		else if (nbEx ==3){
			width=5;
			height=6;
		}
		pattern = new Cellule[width][height];
		fill();

	}

	public Pattern(int nbEx, int xBase, int yBase) {
		this.setXBase(xBase);
		this.setYBase(yBase);
		if (nbEx==1){
			width=3;
			height=4;
		}
		else if (nbEx ==2){
			width=4;
			height=4;
		}
		pattern = new Cellule[width][height];

		fill();
	}

	private void fill() {
		for (int i = 0; i < width; ++i) {
			for (int j = 0; j < height; ++j) {
				pattern[i][j] = new Vide(i, j);
			}
		}
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
		return getWidth() - (getWidth() - getXBase());
	}

	public int placeDroite() {
		return getWidth() - (getXBase() + 1);
	}

	public int placeHaut() {
		return getHeight() - (getHeight() - getYBase());
	}

	public int placeBas() {
		return getHeight() - (getYBase() + 1);
	}

	/**
	 * Crée un pattern qui correspond à l'exemple de grille
	 */
	public void getExemple() {
		if (nbEx == 1) {
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
		}
		else if (nbEx == 2) {
			this.setXBase(0);
			this.setYBase(3);
			this.setCase(new Bois(0,1));
			this.setCase(new Pierre(0,2));
			this.setCase(new Base(0,3));
			
			this.setCase(new Bois(1, 0));
			this.setCase(new Bois(1,1));
			this.setCase(new Pierre(1,2));
			this.setCase(new Pierre(1,3));
			
			this.setCase(new Bois(2, 0));
			this.setCase(new Bois(2,1));
			this.setCase(new Verre(2,2));
			this.setCase(new Pierre(2,3));
			
			this.setCase(new Bois(3,1));
			this.setCase(new Pierre(3,2));
			this.setCase(new Pierre(3,3));
		}
		else if (nbEx ==3){
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














		}
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < pattern.length; i++)
			for (int j = 0; j < pattern[0].length; j++)
				pattern[i][j].paint(g);
	}
}
