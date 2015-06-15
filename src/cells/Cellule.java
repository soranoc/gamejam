package cells;

import java.io.File;

public abstract class Cellule {
	private File sprite;
	private int poids;
	
	/**
	 * 
	 * @return Renvoie le poids du bloc
	 */
	public int getPoids(){
		return poids;
	}
	public void setPoids(int poids){
		this.poids=poids;
	}

	public File getSprite() {
		return sprite;
	}
	public void setSprite(File sprite) {
		this.sprite = sprite;
	}
	
	
	abstract double getPoidsCoeff(double coeff);
	
	abstract boolean isBranche();

	abstract boolean isEmpty();
	
	abstract boolean isBois();
	abstract boolean isPierre();
	abstract boolean isMetal();
	abstract boolean isVerre();
	
}
