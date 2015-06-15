package grille;

import cells.*;

public class Grille {
	private int hauteur = 12;
	private int largeur = 18;
	private Cellule[][] grille;
	private Branche brancheGauche;
	private Branche brancheDroite;

	public Grille (){
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[0].length; j++) {
				grille[i][j] = new Vide();
			}
		}
		brancheDroite = new Branche(30);
		brancheGauche = new Branche(30);
		getExemple();
	}
	
	public void setSegment(int x, int y){
		grille[x][y] = new SegmentBranche(x,y);
	}
	
	private void getExemple(){
		SegmentBranche seg1 = new SegmentBranche(1,5);
		SegmentBranche seg2 = new SegmentBranche(1,6);
		SegmentBranche seg3 = new SegmentBranche(2,7);
		SegmentBranche seg4 = new SegmentBranche(3,7);
		SegmentBranche seg5 = new SegmentBranche(4,8);
		SegmentBranche seg6 = new SegmentBranche(4,9);
		SegmentBranche seg7 = new SegmentBranche(5,10);
		SegmentBranche seg8 = new SegmentBranche(6,9);
		SegmentBranche seg9 = new SegmentBranche(7,9);
		
	}
}
