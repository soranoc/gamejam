package affichage;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Selecteur extends JPanel {
	private Plateau p;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Selecteur(final Plateau p) {
		this.setP(p);
		this.setPreferredSize(new Dimension(360, 120));
		
		JButton boutonBois = new JButton(new ImageIcon("./res/bloc_bois.png"));
		boutonBois.setPreferredSize(new Dimension(60, 60));	
		boutonBois.setToolTipText("Bois");
		this.add(boutonBois);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("bois");
			}
		});
		
		JButton boutonPierre = new JButton(new ImageIcon("./res/bloc_pierre.png"));
		boutonPierre.setPreferredSize(new Dimension(60, 60));	
		boutonPierre.setToolTipText("Pierre");
		this.add(boutonPierre);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("pierre");
			}
		});
		
		JButton boutonMetal = new JButton(new ImageIcon("./res/bloc_metal.png"));
		boutonMetal.setPreferredSize(new Dimension(60, 60));	
		this.add(boutonMetal);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("metal");
			}
		});
		
		JButton boutonVerre = new JButton(new ImageIcon("./res/bloc_verre.png"));
		boutonVerre.setPreferredSize(new Dimension(60, 60));	
		this.add(boutonVerre);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("verre");
			}
		});
		
		JButton boutonBase = new JButton(new ImageIcon("./res/bloc_bois.png"));
		boutonBase.setPreferredSize(new Dimension(60, 60));	
		this.add(boutonBase);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("base");
			}
		});
	}

	public Plateau getP() {
		return p;
	}

	public void setP(Plateau p) {
		this.p = p;
	}
}
