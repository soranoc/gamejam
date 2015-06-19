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

public class Menu {
	public Menu() throws IOException {
		
		final JFrame frame = new JFrame("House on Tree");
		frame.setPreferredSize(new Dimension(500, 600));
		frame.setResizable(false);
		frame.setLocation(300,150);
		
		JLabel label = new JLabel();
		label.setText("Sélection du niveau");
		BufferedImage fond1 = ImageIO.read(new File("./res/fondMenu.png"));
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
	
		
		JButton niv1 = new JButton(new ImageIcon(
				"./res/boutons/boutonNiv1.png"));
		niv1.setBackground(new Color(0,0,0,1));
		niv1.setPreferredSize(new Dimension(130,50));
		niv1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Ecran(1);
				} catch (IOException e) {
					e.printStackTrace();
				}
				frame.setVisible(false);
				frame.dispose();
			}
		});
		
		JButton niv2 = new JButton(new ImageIcon(
				"./res/boutons/boutonNiv2.png"));
		niv2.setBackground(new Color(0,0,0,1));
		niv2.setPreferredSize(new Dimension(130,50));
		niv2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Ecran(2);
				} catch (IOException e) {
					e.printStackTrace();
				}
				frame.setVisible(false);
				frame.dispose();
			}
		});
		
		JButton niv3 = new JButton(new ImageIcon(
				"./res/boutons/boutonNiv3.png"));
		niv3.setBackground(new Color(0,0,0,1));
		niv3.setPreferredSize(new Dimension(130,50));
		niv3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Ecran(3);
				} catch (IOException e) {
					e.printStackTrace();
				}
				frame.setVisible(false);
				frame.dispose();
			}
		});
		
		frame.add(header);
		pane.add(niv1, BorderLayout.NORTH);
		pane.add(niv2, BorderLayout.CENTER);
		pane.add(niv3, BorderLayout.SOUTH);
		frame.add(pane);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) throws IOException {
		new MenuPrincipal();
	}
}
