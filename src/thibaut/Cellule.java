import java.awt.Graphics;
import java.awt.event.MouseEvent;


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
	public abstract void paint(Graphics g);

	/**
	 * Méthode d'événement du clique sur la cellule
	 * @param e
	 */
	public void mouseClicked(MouseEvent e) {
		System.out.println(this);
	}
	
}
