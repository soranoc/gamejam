package cells;

public class Pierre extends Cellule {
	public Pierre(int x, int y){
		super(x,y);
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
		return true;
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
	public void affiche() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPoids() {
		return 2;
	}

}
