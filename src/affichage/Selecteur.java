package affichage;

import grille.Pattern;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.security.auth.module.JndiLoginModule;

public class Selecteur extends JFrame {
	private Plateau p;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Selecteur(Plateau p) throws IOException {
		
		BufferedImage myImage = ImageIO.read(new File("./res/menu.png"));
		this.setContentPane(new ImagePanel(myImage));
		
		this.setP(p);
		this.setPreferredSize(new Dimension(200, 600));
		this.setLocationRelativeTo(getParent());
		this.setAlwaysOnTop(true);
		this.setTitle("Menu");
		this.setResizable(false);
		this.setLayout(new FlowLayout(HEIGHT));
			
		JLabel vide = new JLabel("");
		vide.setPreferredSize(new Dimension(250, 15));

		JLabel boutonsLabel = new JLabel("");
		boutonsLabel.setPreferredSize(new Dimension(250, 15));
		
		JLabel infosLabel = new JLabel("");
		infosLabel.setPreferredSize(new Dimension(180, 15));
		
		JPanel boutons = new JPanel(new BorderLayout());
		boutons.setBackground(new Color(0,0,0,1));
		boutons.setPreferredSize(new Dimension(210,150));
		
		FlowLayout fl = new FlowLayout(WIDTH);
		fl.setHgap(50);
		
		JPanel boutons1 = new JPanel(fl);
		boutons1.setBackground(new Color(0,0,0,1));
		JPanel boutons2 = new JPanel(fl);
		boutons2.setBackground(new Color(0,0,0,1));
		JPanel boutons3 = new JPanel(fl);
		boutons3.setBackground(new Color(0,0,0,1));
		
		Pattern pat = p.getPat();

		
		/*JButton pattern = new JButton(new ImageIcon("./res/pattern.png"));
		pattern.setToolTipText("Modèle");
		pattern.setPreferredSize(new Dimension(180, 180));
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
		});*/
		

		final JButton boutonBois = new JButton(new ImageIcon("./res/boutons/bloc_bois.png"));
		boutonBois.setPreferredSize(new Dimension(40, 40));	
		boutonBois.setToolTipText("Bois");
		boutons1.add(boutonBois);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Plateau.setMatiere("bois");
			}
		});
		
		final JButton boutonPierre = new JButton(new ImageIcon("./res/boutons/bloc_pierre.png"));
		boutonPierre.setPreferredSize(new Dimension(40, 40));	
		boutonPierre.setToolTipText("Pierre");
		boutons1.add(boutonPierre);
		boutonPierre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Plateau.setMatiere("pierre");
			}
		});
		
		final JButton boutonMetal = new JButton(new ImageIcon("./res/boutons/bloc_metal.png"));
		boutonMetal.setPreferredSize(new Dimension(40, 40));
		boutonMetal.setToolTipText("Metal");
		boutons2.add(boutonMetal);
		boutonMetal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Plateau.setMatiere("metal");
			}
		});
		
		final JButton boutonVerre = new JButton(new ImageIcon("./res/boutons/bloc_verre.png"));
		boutonVerre.setPreferredSize(new Dimension(40, 40));
		boutonVerre.setToolTipText("Verre");
		boutons2.add(boutonVerre);
		boutonVerre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Plateau.setMatiere("verre");
			}
		});
		
		final JButton boutonBase = new JButton(new ImageIcon("./res/boutons/bloc_base.jpg"));
		boutonBase.setPreferredSize(new Dimension(40, 40));	
		boutonBase.setToolTipText("Base");
		boutons3.add(boutonBase);
		boutonBase.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Plateau.setMatiere("base");
			}
		});
		
		final JButton boutonVide = new JButton(new ImageIcon("./res/boutons/vide.png"));
		boutonVide.setPreferredSize(new Dimension(40, 40));	
		boutonVide.setToolTipText("Vide");
		boutons3.add(boutonVide);
		boutonVide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Plateau.setMatiere("vide");
			}
		});
		
		this.add(infosLabel);
		this.add(vide);
		this.add(pat);
		this.add(boutonsLabel);
		
		boutons.add(boutons1, BorderLayout.NORTH);
		boutons.add(boutons2, BorderLayout.CENTER);		
		boutons.add(boutons3, BorderLayout.SOUTH);
		
		this.add(boutons);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		//TODO Ajouter ce bouton et ce label dans le panel 
		final JButton boutonSon = new JButton(new ImageIcon("./res/boutons/speaker.png"));
		boutonSon.setPreferredSize(new Dimension(40, 40));	
		boutonSon.setToolTipText("Activer/Désactiver le son");
		boutonSon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(Plateau.getSound()==true){
					Plateau.setSound(false);
				}
				else{
					Plateau.setSound(true);
				}
			}
		});
		
		JLabel Label;

		if(Plateau.getSound()==true){
			Label = new JLabel("On");
		}
		else{
			Label = new JLabel("Off");
		}
		// panelSon.add(boutonVide);
		// panelSon.add(Label);
		//END-TODO
	}
	
	public Plateau getP() {
		return p;
	}

	public void setP(Plateau p) {
		this.p = p;
	}
}
