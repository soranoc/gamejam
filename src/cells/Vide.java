package cells;

public class Vide extends Cellule {


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
	public void affiche() {
		//Le vide ne s'affichant pas, cette méthode est vide
	}

	@Override
	public int getPoids() {
		// TODO Auto-generated method stub
		return 0;
	}

}
