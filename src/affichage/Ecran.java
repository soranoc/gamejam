package affichage;

import grille.Grille;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class Ecran extends JFrame{

	private static final long serialVersionUID = 1L;
	private static final Grille grille = new Grille();
	
	public Ecran(int nbEx) throws IOException {
		
		super("House on Tree");
		
		
		BufferedImage myImage = ImageIO.read(new File("./res/fond.png"));
		this.setContentPane(new ImagePanel(myImage));
		
		
		setPreferredSize(new Dimension(725,790));
		setResizable(false);
		
		GridBagConstraints c = new GridBagConstraints();
		setLayout(new GridBagLayout());
		
		
		
//		JPanel pane = new JPanel();
		//pane.setLayout(new GridLayout(2,1));
		
		Plateau p= new Plateau(grille, nbEx);	
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		this.add(p);
		
		createSelecteur(p);
//		
//		//Test
//		System.out.println(grille.getBranches()[0].getPoidsRestant());
//		System.out.println(grille.getBranches()[1].getPoidsRestant());
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void createSelecteur(Plateau p) throws IOException {
		new Selecteur(p);
	}

	public static Grille getGrille(){
		return grille;
	}

}
