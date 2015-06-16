package affichage;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Selecteur extends JPanel {
	private Plateau p;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Selecteur(final Plateau p) {
		
		JPanel boutons = new JPanel(new FlowLayout(WIDTH));
		JPanel infos = new JPanel(new FlowLayout(WIDTH));
		JButton pattern = new JButton(new ImageIcon("./res/blueprint.jpg"));
		pattern.setPreferredSize(new Dimension(120, 60));
		pattern.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BufferedImage image = null;
				try {
					image = ImageIO.read(new File("./res/pattern.png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JLabel picLabel = new JLabel(new ImageIcon(image));
				JOptionPane.showMessageDialog(null, picLabel, "Modèle", JOptionPane.PLAIN_MESSAGE, null);
			}
		});
		
		infos.add(pattern);
		
		this.setLayout(new GridLayout(1,2));
		
		this.setP(p);
		this.setPreferredSize(new Dimension(360, 80));
		
		final JButton boutonBois = new JButton(new ImageIcon("./res/boutons/bloc_bois.png"));
		boutonBois.setPreferredSize(new Dimension(40, 40));	
		boutonBois.setToolTipText("Bois");
		boutons.add(boutonBois);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("bois");
			}
		});
		
		final JButton boutonPierre = new JButton(new ImageIcon("./res/boutons/bloc_pierre.png"));
		boutonPierre.setPreferredSize(new Dimension(40, 40));	
		boutonPierre.setToolTipText("Pierre");
		boutons.add(boutonPierre);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("pierre");
			}
		});
		
		final JButton boutonMetal = new JButton(new ImageIcon("./res/boutons/bloc_metal.png"));
		boutonMetal.setPreferredSize(new Dimension(40, 40));
		boutonMetal.setToolTipText("Metal");
		boutons.add(boutonMetal);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("metal");
			}
		});
		
		final JButton boutonVerre = new JButton(new ImageIcon("./res/boutons/bloc_verre.png"));
		boutonVerre.setPreferredSize(new Dimension(40, 40));
		boutonVerre.setToolTipText("Verre");
		boutons.add(boutonVerre);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("verre");
			}
		});
		
		final JButton boutonBase = new JButton(new ImageIcon("./res/boutons/bloc_base.jpg"));
		boutonBase.setPreferredSize(new Dimension(40, 40));	
		boutonBase.setToolTipText("Base");
		boutons.add(boutonBase);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("base");
			}
		});
		
		this.add(infos);
		this.add(boutons);
	}

	public Plateau getP() {
		return p;
	}

	public void setP(Plateau p) {
		this.p = p;
	}
}
