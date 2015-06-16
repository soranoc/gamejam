package cells;



public class Base extends Cellule {


	public Base(int x, int y) {
		super(x, y);
	}

	@Override
	public int getPoids() {
		return 1;
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
		return false;
	}

	@Override
	public boolean isBase() {
		return true;
	}

	@Override
	public String toString() {
		return "Cellule ["+getX()+","+getY()+"] base";
	}

	@Override
	public String getUrlImg() {
		return "/res/bloc_base.jpg";
	}
}
