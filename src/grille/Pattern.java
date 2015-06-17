package grille;

import cells.*;

public class Pattern {
	private int xBase;
	private int yBase;
	private int width = 3;
	private int height = 4;
	private Cellule [][] pattern = new Cellule[width][height];
	
	public Pattern(){
		fill();
	}
	
	public Pattern(int xBase, int yBase){
		this.setXBase(xBase);
		this.setYBase(yBase);
		fill();
	}

	private void fill(){
		for(int i=0; i<width; ++i){
			for(int j=0; j<height; ++j){
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
		this.setXBase(1);
		this.setYBase(3);
		this.setCase(0, 1, new Bois(0,1));
		this.setCase(0, 2, new Metal(0,2));
		this.setCase(0, 3, new Metal(0,3));
		this.setCase(1, 0, new Bois(1,0));
		this.setCase(1, 1, new Bois(1,1));
		this.setCase(1, 2, new Verre(1,2));
		this.setCase(1, 3, new Base(1,3));
		this.setCase(2, 1, new Bois(2,1));
		this.setCase(2, 2, new Metal(2,2));
		this.setCase(2, 3, new Metal(2,3));


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
