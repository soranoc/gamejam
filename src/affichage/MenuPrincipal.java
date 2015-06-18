package affichage;

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

public class MenuPrincipal {
	public MenuPrincipal() throws IOException {
		
		final JFrame frame = new JFrame("House on Tree");
		frame.setPreferredSize(new Dimension(500, 600));
		frame.setResizable(false);
		frame.setLocation(300,150);
		
		JLabel label = new JLabel();
		label.setText("Sélection du niveau");
		BufferedImage fond1 = ImageIO.read(new File("./res/fondMenuP.png"));
		frame.setContentPane(new ImagePanel(fond1));
		frame.setLayout(new FlowLayout());

		JPanel boutons = new JPanel();
		boutons.setBackground(new Color(0,0,0,1));
		boutons.setPreferredSize(new Dimension(500, 330));
		
		
		BorderLayout bl = new BorderLayout();
		bl.setVgap(50);
		JPanel pane = new JPanel(bl);
		
		pane.setBackground(new Color(0,0,0,1));
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0,0,0,1));
		header.setPreferredSize(new Dimension(500,200));
		
		JPanel vide = new JPanel();
		vide.setBackground(new Color(0,0,0,1));
		vide.setPreferredSize(new Dimension(500,100));
		
		JPanel vide2 = new JPanel();
		vide2.setBackground(new Color(0,0,0,1));
		vide2.setPreferredSize(new Dimension(500,100));
	
		
		JButton jeu = new JButton(new ImageIcon(
				"./res/boutons/boutonJouer.png"));
		jeu.setBackground(new Color(0,0,0,1));
		jeu.setPreferredSize(new Dimension(130,50));
		jeu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Menu();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		
		JButton bac = new JButton(new ImageIcon(
				"./res/boutons/boutonBac.png"));
		bac.setBackground(new Color(0,0,0,1));
		bac.setPreferredSize(new Dimension(130,50));
		bac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Ecran(-1);
					frame.setVisible(false);
					frame.dispose();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		JButton chrono = new JButton(new ImageIcon(
				"./res/boutons/boutonChrono.png"));
		chrono.setBackground(new Color(0,0,0,1));
		chrono.setPreferredSize(new Dimension(130,50));
		chrono.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Menu();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		
		frame.add(header);
		pane.add(jeu, BorderLayout.NORTH);
		pane.add(bac, BorderLayout.CENTER);
		pane.add(chrono, BorderLayout.SOUTH);
		frame.add(pane);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) throws IOException {
		new MenuPrincipal();
	}
}
