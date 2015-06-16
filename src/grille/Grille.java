package grille;
import cells.Bois;
import cells.Branche;
import cells.Cellule;
import cells.Metal;
import cells.SegmentBranche;
import cells.Vide;


public class Grille {
	
	public static final int WIDTH = 18;
	public static final int HEIGHT = 12;
	
	
	private Cellule[][] grille;
	private Branche[] branches;

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
		getExemple();
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
	
	private void setSegment(SegmentBranche sb){
		grille[sb.getX()][sb.getY()] = sb;
	}
	
	private void getExemple(){
		branches  = new Branche[]{new Branche(30), new Branche(30)};
		
		// Branche Gauche
		SegmentBranche seg1 = new SegmentBranche(1,5);
		SegmentBranche seg2 = new SegmentBranche(1,6);
		SegmentBranche seg3 = new SegmentBranche(2,7);
		SegmentBranche seg4 = new SegmentBranche(3,7);
		SegmentBranche seg5 = new SegmentBranche(4,8);
		SegmentBranche seg6 = new SegmentBranche(4,9);
		SegmentBranche seg7 = new SegmentBranche(5,10);
		SegmentBranche seg8 = new SegmentBranche(6,9);
		SegmentBranche seg9 = new SegmentBranche(7,9);
		SegmentBranche seg10 = new SegmentBranche(7,10);
		SegmentBranche seg11 = new SegmentBranche(7,11);
		branches[0].ajouterSegment(seg1);
		branches[0].ajouterSegment(seg2);
		branches[0].ajouterSegment(seg3);
		branches[0].ajouterSegment(seg4);
		branches[0].ajouterSegment(seg5);
		branches[0].ajouterSegment(seg6);
		branches[0].ajouterSegment(seg7);
		branches[0].ajouterSegment(seg8);
		branches[0].ajouterSegment(seg9);
		branches[0].ajouterSegment(seg10);
		branches[0].ajouterSegment(seg11);
		setSegment(seg1);
		setSegment(seg2);
		setSegment(seg3);
		setSegment(seg4);
		setSegment(seg5);
		setSegment(seg6);
		setSegment(seg7);
		setSegment(seg8);
		setSegment(seg9);
		setSegment(seg10);
		setSegment(seg11);
		
		// Branche Droite
		SegmentBranche seg12 = new SegmentBranche(10,11);
		SegmentBranche seg13 = new SegmentBranche(11,11);
		SegmentBranche seg14 = new SegmentBranche(12,10);
		SegmentBranche seg15 = new SegmentBranche(13,9);
		SegmentBranche seg16 = new SegmentBranche(13,8);
		SegmentBranche seg17 = new SegmentBranche(14,8);
		SegmentBranche seg18 = new SegmentBranche(15,8);
		SegmentBranche seg19 = new SegmentBranche(16,9);
		branches[0].ajouterSegment(seg12);
		branches[0].ajouterSegment(seg13);
		branches[0].ajouterSegment(seg14);
		branches[0].ajouterSegment(seg15);
		branches[0].ajouterSegment(seg16);
		branches[0].ajouterSegment(seg17);
		branches[0].ajouterSegment(seg18);
		branches[0].ajouterSegment(seg19);
		setSegment(seg12);
		setSegment(seg13);
		setSegment(seg14);
		setSegment(seg15);
		setSegment(seg16);
		setSegment(seg17);
		setSegment(seg18);
		setSegment(seg19);
		
		//Deux cases pour l'exemple
		setCellule(1, 4, new Metal(1, 4));
		setCellule(11, 10, new Bois(11, 10));
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
