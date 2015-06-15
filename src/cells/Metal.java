package cells;

public class Metal extends Cellule {

	public Metal(int x, int y) {
		super(x, y);
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
	public void affiche() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPoids() {
		return 4;
	}

}
