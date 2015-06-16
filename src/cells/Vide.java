package cells;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;



public class Vide extends Cellule{
	
	public Vide(int x, int y){
		super(x,y);
	}

	public String toString() {
		return "Cellule Vide [x=" + getX() + ", y=" + getY() + "]";
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(new Color(new Random().nextInt(100),new Random().nextInt(256),0));
		
		g2d.fillRect(getPixelX(), getPixelY(), Cellule.SIZE, Cellule.SIZE);
	}

	@Override
	public boolean isBranche() {
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
	public boolean isBloc() {
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
	public String getUrlImg() {
		return null;
	}
}
