package cells;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Bois extends Cellule {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Bois (int x, int y){
		super(x,y);
		add(new JLabel(new ImageIcon("./res/bloc_bois.png")));
		setVisible(true);
	}
	
	@Override
	public boolean isBranche() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isBois() {
		return true;
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
		return false;
	}

	@Override
	public boolean isBloc() {
		return true;
	}


	@Override
	public int getPoids() {
		return 1;
	}

	@Override
	public boolean isBase() {
		return false;
	}


}
