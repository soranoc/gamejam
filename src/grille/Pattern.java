package grille;

import cells.Base;
import cells.Bois;
import cells.Cellule;
import cells.Vide;

public class Pattern {
	private int xBase;
	private int yBase;
	private int width = 5;
	private int height = 5;
	private Cellule [][] pattern = new Cellule[5][5];
	
	public Pattern(){
		fill();
	}
	
	public Pattern(int xBase, int yBase){
		this.setXBase(xBase);
		this.setYBase(yBase);
		fill();
	}

	private void fill(){
		for(int i=0; i<5; ++i){
			for(int j=0; j<5; ++j){
				pattern[i][j]=new Vide(i, j);
			}
		}
	}
	public void setCase(int x, int y, Cellule c){
		pattern[x][y] = c;
	}
	
	public Cellule getCase(int x, int y){
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

	public Cellule [][] getPattern() {
		return pattern;
	}

	public void setPattern(Cellule [][] pattern) {
		this.pattern = pattern;
	}
	
	public int placeGauche(){
		return getWidth()-(getWidth()-getXBase());
	}
	
	public int placeDroite(){
		return getWidth()-(getXBase()+1);
	}
	
	public int placeHaut(){
		return getHeight()-(getHeight()-getYBase());
	}
	
	public int placeBas(){
		return getHeight()-(getYBase()+1);
	}

	/**
	 * Crée un pattern qui correspond à l'exemple de grille 
	 */
	public void getExemple(){
		this.setXBase(2);
		this.setYBase(4);
		this.setCase(2, 0, new Bois(2,0));
		this.setCase(2, 1, new Bois(2,1));
		this.setCase(2, 2, new Bois(2,2));
		this.setCase(2, 3, new Bois(2,3));
		this.setCase(2, 4, new Base(2,4));

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
}
