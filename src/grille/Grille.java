package grille;

import utils.Properties;
import affichage.Plateau;
import cells.*;

public class Grille {
	private Cellule[][] grille;
	private Branche brancheGauche;
	private Branche brancheDroite;

	public Grille (){
		grille = new Cellule[Properties.HEIGHT][Properties.WIDTH];
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[0].length; j++) {
				grille[i][j] = new Vide(i,j);
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
		// Branche Gauche
		SegmentBranche seg1 = new SegmentBranche(5,1);
		SegmentBranche seg2 = new SegmentBranche(6,1);
		SegmentBranche seg3 = new SegmentBranche(7,2);
		SegmentBranche seg4 = new SegmentBranche(7,3);
		SegmentBranche seg5 = new SegmentBranche(8,4);
		SegmentBranche seg6 = new SegmentBranche(9,4);
		SegmentBranche seg7 = new SegmentBranche(10,5);
		SegmentBranche seg8 = new SegmentBranche(9,6);
		SegmentBranche seg9 = new SegmentBranche(9,7);
		SegmentBranche seg10 = new SegmentBranche(10,7);
		SegmentBranche seg11 = new SegmentBranche(11,7);
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
		setSegment(seg1.getX(), seg1.getY());
		setSegment(seg2.getX(), seg2.getY());
		setSegment(seg3.getX(), seg3.getY());
		setSegment(seg4.getX(), seg4.getY());
		setSegment(seg5.getX(), seg5.getY());
		setSegment(seg6.getX(), seg6.getY());
		setSegment(seg7.getX(), seg7.getY());
		setSegment(seg8.getX(), seg8.getY());
		setSegment(seg9.getX(), seg9.getY());
		setSegment(seg10.getX(), seg10.getY());
		setSegment(seg11.getX(), seg11.getY());
		
		// Branche Droite
		SegmentBranche seg12 = new SegmentBranche(11,10);
		SegmentBranche seg13 = new SegmentBranche(11,11);
		SegmentBranche seg14 = new SegmentBranche(10,12);
		SegmentBranche seg15 = new SegmentBranche(9,13);
		SegmentBranche seg16 = new SegmentBranche(8,13);
		SegmentBranche seg17 = new SegmentBranche(8,14);
		SegmentBranche seg18 = new SegmentBranche(8,15);
		SegmentBranche seg19 = new SegmentBranche(9,16);
		brancheDroite.ajouterSegment(seg12);
		brancheDroite.ajouterSegment(seg13);
		brancheDroite.ajouterSegment(seg14);
		brancheDroite.ajouterSegment(seg15);
		brancheDroite.ajouterSegment(seg16);
		brancheDroite.ajouterSegment(seg17);
		brancheDroite.ajouterSegment(seg18);
		brancheDroite.ajouterSegment(seg19);
		setSegment(seg12.getX(), seg12.getY());
		setSegment(seg13.getX(), seg13.getY());
		setSegment(seg14.getX(), seg14.getY());
		setSegment(seg15.getX(), seg15.getY());
		setSegment(seg16.getX(), seg16.getY());
		setSegment(seg17.getX(), seg17.getY());
		setSegment(seg18.getX(), seg18.getY());
		setSegment(seg19.getX(), seg19.getY());
	}
	
	public Cellule[][] getGrille(){
		return grille;
	}
	
	public void update(){
		
	}
	
	public int getWidth(){
		return grille[0].length;
	}
	
	public int getHeight(){
		return grille.length;
	}
	
	public Cellule getCellule(int x, int y){
		return grille[x][y];
	}
}
