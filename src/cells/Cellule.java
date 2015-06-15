package cells;

import java.io.File;

public abstract class Cellule {
	private File sprite;
	private int poids;

	/**
	 * 
	 * @return Renvoie le poids du bloc
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * 
	 * @param poids
	 *            le nouveau poids de la cellule
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/**
	 * 
	 * @return Renvoie le fichier correspondant au Sprite
	 */
	public File getSprite() {
		return sprite;
	}

	/**
	 * 
	 * @param sprite
	 *            Le nouveau fichier qui servira de sprite
	 */
	public void setSprite(File sprite) {
		this.sprite = sprite;
	}

	/**
	 * 
	 * @param coeff
	 *            Le coefficient correspondant à la branche sur laquelle le bloc
	 *            est posé
	 * @return le poids multiplié par le coefficient
	 */
	public double getPoidsCoeff(double coeff) {
		return coeff * poids;
	}

	/**
	 * 
	 * @return true si la cellule est une branche
	 */
	public abstract boolean isBranche();

	/**
	 * 
	 * @return true si la cellule est un bloc
	 */
	public abstract boolean isBloc();

	/**
	 * 
	 * @return true si la cellule est vide
	 */
	public abstract boolean isEmpty();

	/**
	 * 
	 * @return true si la cellule est un bloc de bois
	 */
	public abstract boolean isBois();

	/**
	 * 
	 * @return true si la cellule est un bloc de pierre
	 */
	public abstract boolean isPierre();

	/**
	 * 
	 * @return true si la cellule est un bloc de metal
	 */
	public abstract boolean isMetal();

	/**
	 * 
	 * @return true si la cellule est un bloc de verre
	 */
	public abstract boolean isVerre();

}
