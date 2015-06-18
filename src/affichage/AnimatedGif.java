package affichage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AnimatedGif {

	public AnimatedGif() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException ex) {
				} catch (InstantiationException ex) {
				} catch (IllegalAccessException ex) {
				} catch (UnsupportedLookAndFeelException ex) {
				}

				// JFrame frame = new JFrame("Test");
				// JPanel j = new JPanel();
				// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// frame.setLayout(new BorderLayout());
				// j.add(new PaintPane());
				// frame.add(j);
				// frame.pack();
				// frame.setLocationRelativeTo(null);
				// frame.setVisible(true);
			}
		});
	}

	public PaintPane getPaintPane() {
		return new PaintPane();
	}

	public class PaintPane extends JPanel {

		private static final long serialVersionUID = 1L;
		private ImageIcon image;

		public PaintPane() {

			this.setDoubleBuffered(true);
			this.setPreferredSize(new Dimension(120, 165));
			image = new ImageIcon(getClass().getResource("/res/robot.gif"));
			Timer timer = new Timer(40, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					repaint();
				}
			});
			timer.start();
		}

		@Override
		public Dimension getPreferredSize() {
			return image == null ? new Dimension(200, 200) : new Dimension(
					image.getIconWidth(), image.getIconHeight());
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // This is very important!
			Image img = new ImageIcon(getClass().getResource(
					"/res/fondrobot.png")).getImage();
			g.drawImage(img, 0, 0, 153, 210, null);
			int x = (getWidth() - image.getIconWidth()) / 2;
			int y = (getHeight() - image.getIconHeight()) / 2;
			image.paintIcon(this, g, x, y);
		}

	}

}