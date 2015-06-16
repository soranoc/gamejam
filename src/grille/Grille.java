package grille;
import cells.Branche;
import cells.Cellule;
import cells.SegmentBranche;
import cells.Vide;


public class Grille {
	
	public static final int WIDTH = 18;
	public static final int HEIGHT = 12;
	
	
	private Cellule[][] grille;
	private Branche brancheGauche = new Branche(30);
	private Branche brancheDroite = new Branche(30);

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
		brancheGauche.ajouterSegment(seg1);
		brancheGauche.ajouterSegment(seg2);
		brancheGauche.ajouterSegment(seg3);
		brancheGauche.ajouterSegment(seg4);
		brancheGauche.ajouterSegment(seg5);
		brancheGauche.ajouterSegment(seg6);
		brancheGauche.ajouterSegment(seg7);
		brancheGauche.ajouterSegment(seg8);
		brancheGauche.ajouterSegment(seg9);
		brancheGauche.ajouterSegment(seg10);
		brancheGauche.ajouterSegment(seg11);
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
		brancheDroite.ajouterSegment(seg12);
		brancheDroite.ajouterSegment(seg13);
		brancheDroite.ajouterSegment(seg14);
		brancheDroite.ajouterSegment(seg15);
		brancheDroite.ajouterSegment(seg16);
		brancheDroite.ajouterSegment(seg17);
		brancheDroite.ajouterSegment(seg18);
		brancheDroite.ajouterSegment(seg19);
		setSegment(seg12);
		setSegment(seg13);
		setSegment(seg14);
		setSegment(seg15);
		setSegment(seg16);
		setSegment(seg17);
		setSegment(seg18);
		setSegment(seg19);
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
