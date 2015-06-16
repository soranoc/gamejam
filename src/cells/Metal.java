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
	public int getPoids() {
		return 4;
	}

	@Override
	public boolean isBase() {
		return false;
	}
	
	@Override
	public String toString() {
		return "Cellule ["+getX()+","+getY()+"] metal";
	}

	@Override
	public String getUrlImg() {
		return "res/bloc_metal.png";
	}

}
