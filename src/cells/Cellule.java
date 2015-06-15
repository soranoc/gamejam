package cells;

import java.awt.Dimension;

import javax.swing.JPanel;


public abstract class Cellule extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	
	public Cellule(){
	}
	
	public Cellule(int x, int y){
		this.setX(x);
		this.setY(y);
		this.setPreferredSize(new Dimension(20,20));
	}
	
	abstract public int getPoids();
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

	public abstract boolean isBase();
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
