package cells;

public class Vide extends Cellule {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean isBranche() {
		return false;
	}

	@Override
	public boolean isBloc() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return true;
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
		return false;
	}

	@Override
	public int getPoids() {
		// TODO Auto-generated method stub
		return 0;
	}

}
