package cells;

public class Verre extends Cellule {

	public Verre(int x, int y) {
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
		return false;
	}

	@Override
	public boolean isVerre() {
		return true;
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPoids() {
		return 0;
	}

}
