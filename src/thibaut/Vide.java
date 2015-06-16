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

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(new Color(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256)));
		
		g2d.fillRect(getPixelX(), getPixelY(), Cellule.SIZE, Cellule.SIZE);
	}
}
