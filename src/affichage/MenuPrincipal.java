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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal {
	public MenuPrincipal() throws IOException {
		
		final JFrame frame = new JFrame("House on Tree");
		frame.setPreferredSize(new Dimension(500, 600));
		frame.setResizable(false);
		frame.setLocation(300,300);
		
		JLabel label = new JLabel();
		label.setText("Sélection du niveau");
		BufferedImage fond1 = ImageIO.read(new File("./res/fond.png"));
		frame.setContentPane(new ImagePanel(fond1));
		frame.setLayout(new FlowLayout());

		JPanel pane = new JPanel();
		JPanel header = new JPanel();
		header.setBackground(new Color(0,0,0,1));
		header.setPreferredSize(new Dimension(500,200));
		
		JButton jeu = new JButton("Jouer");
		jeu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Menu();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		JButton bac = new JButton("Bac à Sable");
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
		JButton niv3 = new JButton("3");
		niv3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Ecran(3);
					frame.setVisible(false);
					frame.dispose();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		frame.add(header);
		pane.add(jeu);
		
		//pane.add(niv2);
		//pane.add(niv3);
		frame.add(pane);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
