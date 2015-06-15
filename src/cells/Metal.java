package cells;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Metal extends Cellule {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Metal(int x, int y) {
		super(x, y);
		add(new JLabel(new ImageIcon("./res/bloc_metal.png")));
		setVisible(true);
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
		return true;
	}

	@Override
	public boolean isVerre() {
		return false;
	}

	@Override
	public int getPoids() {
		return 4;
	}

	@Override
	public boolean isBase() {
		return false;
	}
	
	@Override
	public String toString() {
		return "Cellule ["+x+","+y+"] metal";
	}

}
