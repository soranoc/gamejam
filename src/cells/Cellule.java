package cells;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

public abstract class Cellule {
	
	public static final int SIZE = 32;
	
	private int x,y;
	
	/**
	 * Constructeur par défaut {x : 0, y : 0}
	 */
	public Cellule() {
		this(0,0);
	}
	
	/**
	 * Constructeur 
	 * @param x 
	 * @param y
	 */
	public Cellule(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * @return Coordonnée X
	 */
	public int getX() {
		return x;
	}

	/**
	 * Modifie coordonnée X
	 * @param x
	 */
	private void setX(int x) {
		this.x = x;
	}

	/**
	 * @return Coordonnée Y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modifie Coordornnée Y
	 * @param y
	 */
	private void setY(int y) {
		this.y = y;
	}
	
	/**
	 * @return Coordonnée du pixel X (x * Cellule.SIZE)
	 */
	public int getPixelX(){
		return x * Cellule.SIZE;
	}
	
	/**
	 * @return Coordonnée du pixel Y (y * Cellule.SIZE)
	 */
	public int getPixelY(){
		return y * Cellule.SIZE;
	}

	public String toString() {
		return "Cellule [x=" + getX() + ", y=" + getY() + "]";
	}
	
	/**
	 * Méthode utiliser pour afficher la cellule
	 */
	
	public void paint(Graphics g, Component c){
		ImageIcon img = new ImageIcon(getClass().getResource(this.getUrlImg()));
		img.paintIcon(c, g, getX(), getY());
	}

	abstract public String getUrlImg();

	/**
	 * Méthode d'événement du clique sur la cellule
	 * @param e
	 */
	public void mouseClicked(MouseEvent e) {
		System.out.println(this);
	}
	
	
	abstract public boolean isBranche();

	abstract public boolean isEmpty();
	
	abstract public boolean isBois();

	abstract public boolean isPierre();

	abstract public boolean isMetal();

	abstract public boolean isVerre();

	abstract public boolean isBloc();

	abstract public int getPoids();

	abstract public boolean isBase() ;
}
