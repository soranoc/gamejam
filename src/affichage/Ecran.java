package affichage;

import grille.Grille;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import utils.Properties;

public class Ecran extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final Grille grille = new Grille();

	public Ecran(int nbEx) throws IOException{

		super("House on Tree");

		if(nbEx == -1){
			BufferedImage fond1 = ImageIO.read(new File("./res/fondBac.png"));
			this.setContentPane(new ImagePanel(fond1));
		}
		else{
			BufferedImage fond1 = ImageIO.read(new File("./res/fond1.png"));
			this.setContentPane(new ImagePanel(fond1));
		}

		setPreferredSize(new Dimension(725, 790));
		setResizable(false);
		
		Container contentPane = getContentPane();
        contentPane.setLayout(null);

		Plateau p = new Plateau(grille, nbEx, this);
		contentPane.add(p);

		AnimatedGif ag = new AnimatedGif();
		JPanel gif = ag.getPaintPane();

		contentPane.add(gif);
		
		@SuppressWarnings("unused")
		Insets insets = contentPane.getInsets();
		p.setBounds(75, 80, Properties.WIDTH * Properties.SIZE_CELLS, Properties.HEIGHT
				* Properties.SIZE_CELLS);
		gif.setBounds(550, 580, 120, 165);

		createSelecteur(p);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void createSelecteur(Plateau p) throws IOException {
		new Selecteur(p);
	}

	public static Grille getGrille() {
		return grille;
	}
	

}
