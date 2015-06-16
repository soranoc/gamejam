package affichage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tronc extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Tronc(){
		setPreferredSize(new Dimension(575, 340));
	}
	public void paint(Graphics g) {
		Image img = new ImageIcon(getClass().getResource("/res/tronc.png"))
				.getImage();
		g.drawImage(img, 0, 0,null);
	}

}
