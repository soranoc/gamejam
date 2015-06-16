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
		this.setPreferredSize(new Dimension(360, 67));
		
		final JButton boutonBois = new JButton(new ImageIcon("./res/bloc_bois.png"));
		boutonBois.setPreferredSize(new Dimension(40, 40));	
		boutonBois.setToolTipText("Bois");
		this.add(boutonBois);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("bois");
			}
		});
		
		final JButton boutonPierre = new JButton(new ImageIcon("./res/bloc_pierre.png"));
		boutonPierre.setPreferredSize(new Dimension(40, 40));	
		boutonPierre.setToolTipText("Pierre");
		this.add(boutonPierre);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("pierre");
			}
		});
		
		final JButton boutonMetal = new JButton(new ImageIcon("./res/bloc_metal.png"));
		boutonMetal.setPreferredSize(new Dimension(40, 40));
		boutonMetal.setToolTipText("Metal");
		this.add(boutonMetal);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("metal");
			}
		});
		
		final JButton boutonVerre = new JButton(new ImageIcon("./res/bloc_verre.png"));
		boutonVerre.setPreferredSize(new Dimension(40, 40));
		boutonVerre.setToolTipText("Verre");
		this.add(boutonVerre);
		boutonBois.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setMatiere("verre");
			}
		});
		
		final JButton boutonBase = new JButton(new ImageIcon("./res/bloc_base.png"));
		boutonBase.setPreferredSize(new Dimension(40, 40));	
		boutonBase.setToolTipText("Base");
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
