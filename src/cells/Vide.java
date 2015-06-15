package cells;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.Random;

import utils.Properties;

public class Vide extends Cellule {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Vide(int x, int y) {
		super(x,y);
		this.setVisible(true);
	}

	@Override
	public boolean isBranche() {
		return false;
	}

	@Override
	public boolean isBloc() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public boolean isBois() {
		return false;
	}

	@Override
	public boolean isPierre() {
		return false;
	}

	@Override
	public boolean isMetal() {
		return false;
	}

	@Override
	public boolean isVerre() {
		return false;
	}

	@Override
	public int getPoids() {
		return 0;
	}

	@Override
	public boolean isBase() {
		return false;
	}

	@Override
	public String toString() {
		return "Cellule ["+getX()+","+getY()+"] vide";
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(new Color(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256)));
		g2d.fillRect(y*Properties.SIZE_CELLS, x*Properties.SIZE_CELLS, Properties.SIZE_CELLS,Properties.SIZE_CELLS);
	}

	@Override
	public void mouseHasClicked(MouseEvent e) {
		System.out.println("G cliké sur "+this);
	}

}
