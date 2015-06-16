package grille;
import cells.Cellule;
import cells.Vide;


public class Grille {
	
	public static final int WIDTH = 18;
	public static final int HEIGHT = 12;
	
	
	private Cellule[][] grille;
	
	/**
	 * Constructeur par défault avec valeur des constantes
	 */
	public Grille() {
		this(Grille.WIDTH,Grille.HEIGHT);
	}
	
	/**
	 * Constructeur
	 * @param w : WIDTH
	 * @param h : HEIGHT
	 */
	public Grille(int w, int h){
		grille = new Cellule[w][h];
		
		for(int i = 0; i < getWidth(); i++)
			for(int j = 0; j < getHeight(); j++)
				grille[i][j] = new Vide(i,j);
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return Cellule à la coordonnée {x,y} si elle existe
	 * @throws ArrayIndexOutOfBoundsException si la cellule en {x,y} n'existe pas
	 */
	public Cellule getCellule(int x, int y){
		if(x >= 0 && x < getWidth() && y >=0 && y < getHeight())
			return grille[x][y];
		else
			throw new ArrayIndexOutOfBoundsException("Cellule {x : "+x+", y :"+y+"} n'existe pas.");
	}
	
	/**
	 * Modifie la cellule à la coordonnée {x,y} par la cellule en paramètre
	 * @param x
	 * @param y
	 * @param cellule
	 */
	public void setCellule(int x, int y, Cellule cellule){
		grille[x][y] = cellule;
	}
	
	/**
	 * 
	 * @return longueur de la grille
	 */
	public int getWidth(){
		return grille.length;
	}
	
	/**
	 * 
	 * @return largeur de la grille
	 */
	public int getHeight(){
		return grille[0].length;
	}

}
