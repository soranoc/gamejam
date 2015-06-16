package cells;

import java.util.ArrayList;
import java.util.List;

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
}
