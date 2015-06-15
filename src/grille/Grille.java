package grille;

import cells.*;

public class Grille {
	private int hauteur = 12;
	private int largeur = 18;
	private Cellule[][] grille;

	public Grille (){
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[0].length; j++) {
				grille[i][j] = new Vide();
			}
		}
		getExemple();
	}
	
	public void setSegment(int x, int y){
		
	}
	
	private void getExemple(){
		grille[1][5] = new SegmentBranche(5);
		grille[1][6] = new SegmentBranche(6);
		grille[2][7] = new SegmentBranche(7);
		grille[2][7] = new SegmentBranche(7);
	}
}
