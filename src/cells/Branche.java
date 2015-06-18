package cells;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import affichage.Ecran;

public class Branche {
	List<SegmentBranche> segments = new ArrayList<SegmentBranche>();
	private int poidsMax;

	public Branche(int poidsMax) {
		this.setPoidsMax(poidsMax);

	}

	public void ajouterSegment(SegmentBranche sb) {
		segments.add(sb);
	}

	public int getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}

	private int getPoidsTotal() {
		double poidsTotal = 0;
		for (int i = 0; i < segments.size(); ++i) {
			poidsTotal = poidsTotal + segments.get(i).getPoidsTotal();
		}
		return (int) poidsTotal;
	}

	public int getPoidsRestant() {
		return poidsMax - getPoidsTotal();
	}

	public boolean isAlmostBroken() {
		if (getPoidsRestant() < getPoidsMax() / 5.0) {
			for (int i = 0; i < segments.size(); ++i) {
				segments.get(i).setOkay(false);
			}
			return true;
		}
		for (int i = 0; i < segments.size(); ++i) {
			segments.get(i).setOkay(true);
		}
		return false;
	}

	/**
	 * 
	 * @return true si la branche peut supporter son poids actuel
	 */
	public boolean isOkay() {
		if (getPoidsRestant() > 0) {
			return true;
		}
		return false;
	}

	public void casse() {
		SegmentBranche c;
		int size = segments.size();
		for (int i = 0; i < size; ++i) {
			c = segments.get(0);
			c.casse();
			segments.remove(c);
			Ecran.getGrille().setCellule(c.getX(), c.getY(),
					new Vide(c.getX(), c.getY()));
		}
	}

	public boolean containsSeg(SegmentBranche sb) {
		return segments.contains(sb);
	}

	public void infos(int i) {
		JOptionPane.showMessageDialog(null, "" + getPoidsTotal() + "/"
				+ getPoidsMax(), "Branche n°" + (i + 1),
				JOptionPane.PLAIN_MESSAGE);

	}

}
