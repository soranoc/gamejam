package cells;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Verre extends Cellule {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Verre(int x, int y) {
		super(x, y);
		add(new JLabel(new ImageIcon("./res/bloc_verre.png")));
	}

	@Override
	public boolean isBranche() {
		return false;
	}

	@Override
	public boolean isBloc() {
		return true;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isBois() {
		return false;
	}

	@Override
	public boolean isPierre() {
		return false;
	}

	@Override
	public boolean isMetal() {
		return false;
	}

	@Override
	public boolean isVerre() {
		return true;
	}

	@Override
	public int getPoids() {
		return 0;
	}

	@Override
	public boolean isBase() {
		return false;
	}

}
