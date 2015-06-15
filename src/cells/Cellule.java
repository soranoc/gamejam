package cells;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import utils.Properties;


public abstract class Cellule extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int x;
	protected int y;
	
	public Cellule(){
		this.setPreferredSize(new Dimension(Properties.SIZE_CELLS,Properties.SIZE_CELLS));
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {}
			
			@Override
			public void mousePressed(MouseEvent arg0) {}			
			@Override
			public void mouseExited(MouseEvent arg0) {}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				mouseHasClicked(arg0);
			}
		});
	}
	
	public abstract void mouseHasClicked(MouseEvent e);
	
	public Cellule(int x, int y){
		this();
		this.setX(x);
		this.setY(y);
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
	
	@Override
	public abstract String toString();

	public abstract void draw(Graphics2D g2d);

}
