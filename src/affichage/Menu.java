package affichage;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {
	public Menu() {
		final JFrame frame = new JFrame("House on Tree");
		frame.setPreferredSize(new Dimension(300, 80));
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
		JButton tuto = new JButton("Tuto");
		tuto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
					new Tuto();
			}
		});
		pane.add(niv1);
		pane.add(niv2);
		pane.add(niv3);
		pane.add(tuto);
		frame.add(pane);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
