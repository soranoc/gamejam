package grille;

import cells.*;

public class Grille {

	public static final int WIDTH = 18;
	public static final int HEIGHT = 12;

	private Cellule[][] grille;
	private Branche[] branches;

	/**
	 * Constructeur par défault avec valeur des constantes
	 */
	public Grille() {
		this(Grille.WIDTH, Grille.HEIGHT);
	}

	/**
	 * Constructeur
	 * 
	 * @param w
	 *            : WIDTH
	 * @param h
	 *            : HEIGHT
	 */
	public Grille(int w, int h) {
		grille = new Cellule[w][h];

		for (int i = 0; i < getWidth(); i++)
			for (int j = 0; j < getHeight(); j++)
				grille[i][j] = new Vide(i, j);
		getExemple();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return Cellule à la coordonnée {x,y} si elle existe
	 * @throws ArrayIndexOutOfBoundsException
	 *             si la cellule en {x,y} n'existe pas
	 */
	public Cellule getCellule(int x, int y) {
		if (x >= 0 && x < getWidth() && y >= 0 && y < getHeight())
			return grille[x][y];
		else
			throw new ArrayIndexOutOfBoundsException("Cellule {x : " + x
					+ ", y :" + y + "} n'existe pas.");
	}

	private void setSegment(SegmentBranche sb) {
		grille[sb.getX()][sb.getY()] = sb;
	}

	private void getExemple() {
		branches = new Branche[] { new Branche(30), new Branche(30) };

		// Branche Gauche
		SegmentBranche seg1 = new SegmentBranche(1, 5);
		SegmentBranche seg2 = new SegmentBranche(1, 6);
		SegmentBranche seg3 = new SegmentBranche(2, 7);
		SegmentBranche seg4 = new SegmentBranche(3, 7);
		SegmentBranche seg5 = new SegmentBranche(4, 8);
		SegmentBranche seg6 = new SegmentBranche(4, 9);
		SegmentBranche seg7 = new SegmentBranche(5, 10);
		SegmentBranche seg8 = new SegmentBranche(6, 9);
		SegmentBranche seg9 = new SegmentBranche(7, 9);
		SegmentBranche seg10 = new SegmentBranche(7, 10);
		SegmentBranche seg11 = new SegmentBranche(7, 11);
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
		SegmentBranche seg12 = new SegmentBranche(10, 11);
		SegmentBranche seg13 = new SegmentBranche(11, 11);
		SegmentBranche seg14 = new SegmentBranche(12, 10);
		SegmentBranche seg15 = new SegmentBranche(13, 9);
		SegmentBranche seg16 = new SegmentBranche(13, 8);
		SegmentBranche seg17 = new SegmentBranche(14, 8);
		SegmentBranche seg18 = new SegmentBranche(15, 8);
		SegmentBranche seg19 = new SegmentBranche(16, 9);
		branches[1].ajouterSegment(seg12);
		branches[1].ajouterSegment(seg13);
		branches[1].ajouterSegment(seg14);
		branches[1].ajouterSegment(seg15);
		branches[1].ajouterSegment(seg16);
		branches[1].ajouterSegment(seg17);
		branches[1].ajouterSegment(seg18);
		branches[1].ajouterSegment(seg19);
		setSegment(seg12);
		setSegment(seg13);
		setSegment(seg14);
		setSegment(seg15);
		setSegment(seg16);
		setSegment(seg17);
		setSegment(seg18);
		setSegment(seg19);

		// Cases pour l'exemple
		// setCellule(1, 4, new Metal(1, 4));
		// setCellule(14, 7, new Base(14, 7));
		// setCellule(14, 6, new Bois(14, 6));
		// setCellule(14, 5, new Bois(14, 5));
		// setCellule(14, 4, new Bois(14, 4));
		// setCellule(14, 3, new Bois(14, 3));
	}
	
	
	/**
	 * Modifie la cellule à la coordonnée {x,y} par la cellule en paramètre
	 * 
	 * @param x
	 * @param y
	 * @param cellule
	 */
	public void setCellule(int x, int y, Cellule cellule) {
		grille[x][y] = cellule;
	}

	public Branche[] getBranches() {
		return branches;
	}

	public void setBranches(Branche[] branches) {
		this.branches = branches;
	}

	/**
	 * 
	 * @return longueur de la grille
	 */
	public int getWidth() {
		return grille.length;
	}

	/**
	 * 
	 * @return largeur de la grille
	 */
	public int getHeight() {
		return grille[0].length;
	}

	/**
	 * 
	 * @return les coordonnées du bloc base ou null s'il n'y en a aucune
	 */
	public int[] coordBase() {
		int[] coord = new int[2];
		for (int i = 0; i < getWidth(); ++i) {
			for (int j = 0; j < getHeight(); ++j) {
				if (getCellule(i, j).isBase()) {
					coord[0] = i;
					coord[1] = j;
					return coord;
				}
			}
		}
		return null;
	}

	/**
	 * TODO contains(Pattern p)
	 * 
	 * @param p
	 *            Le pattern que l'on doit trouver
	 * @return true si le pattern se trouve dans la grille
	 */
	public boolean contains(Pattern p) {
		int[] coordBase = coordBase();
		int[] coordDebutTest = new int[] { coordBase[0] - p.getXBase(), // Permet
																		// de
																		// localiser
																		// la
																		// première
																		// case
																		// qui
																		// sera
																		// testée
				coordBase[1] - p.getYBase() };

		if (coordBase[0] < p.placeGauche()) {
			return false;
		}
		if ((getWidth() - coordBase[0] - 1) < p.placeDroite()) {
			return false;
		}
		if (coordBase[1] < p.placeHaut()) {
			return false;
		}
		if ((getHeight() - coordBase[1] - 1) < p.placeBas()) {
			return false;
		}

		for (int i = 0; i < p.getW(); ++i) {
			for (int j = 0; j < p.getH(); ++j) {
				if (!getCellule(coordDebutTest[0] + i, coordDebutTest[1] + j)
						.getClass().equals(p.getCase(i, j).getClass())) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isOkay() {
		for (int i = 0; i < branches.length; ++i) {
			if (branches[i] != null) {

				if (!branches[i].isOkay()) {
					casse(i);
				}
				if (branches[i] != null) {
					branches[i].isAlmostBroken();
				}
			}
		}
		for (int i = 0; i < branches.length; ++i) {
			if (branches[i] != null) {
				return true;
			}
		}
		return false;
	}

	public boolean containsBase() {
		for (int i = 0; i < WIDTH; ++i) {
			for (int j = 0; j < HEIGHT; ++j) {
				if (getCellule(i, j).isBase()) {
					return true;
				}
			}
		}
		return false;
	}

	private void casse(int index) {
		if (branches[index] != null) {
			branches[index].casse();
			branches[index] = null;
		}
	}

}
