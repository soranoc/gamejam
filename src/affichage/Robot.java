package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Robot extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panelCentre = new JPanel();
    JLabel imageLabel = new JLabel();
 
    public Robot() {
        try {
            this.setLayout(new BorderLayout());
            setSize(new Dimension(400, 300));
            ImageIcon ii = new ImageIcon(this.getClass().getResource("/res/robot.gif"));
            imageLabel.setIcon(ii);
            imageLabel.setBounds(20,20,ii.getIconWidth(),ii.getIconHeight());
            panelCentre.setLayout(null); 
            panelCentre.setBackground(new Color(0,0,0,1));
            panelCentre.add(imageLabel);
            this.add(panelCentre,BorderLayout.CENTER);
            this.setVisible(true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
 
 
 
	public static void main(String[] args) {
        new Robot();
    }
 
}