package affichage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pattern extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Pattern(){
		this.setPreferredSize(new Dimension (60,60));
	}
	
	public void paint(Graphics g) {
		Image img = new ImageIcon(getClass().getResource("/res/pattern.png"))
				.getImage();
		g.drawImage(img, 0, 0,null);
	}
}
