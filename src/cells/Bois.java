package cells;

public class Bois extends Cellule {
	public Bois() {
		setPoids(1);
		// setSprite("URL");
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

}
