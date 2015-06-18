package affichage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {
	public Menu() {
		final JFrame frame = new JFrame("House on Tree");
		frame.setLocation(300,300);
		
		JLabel label = new JLabel();
		label.setText("Sélection du niveau");
		
		JPanel pane = new JPanel();
		JButton niv1 = new JButton("1");
		niv1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Ecran(1);
					frame.setVisible(false);
					frame.dispose();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		JButton niv2 = new JButton("2");
		niv2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Ecran(2);
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
		pane.add(label);
		pane.add(niv1);
		pane.add(niv2);
		pane.add(niv3);
		frame.add(pane);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new Menu();
	}
}
