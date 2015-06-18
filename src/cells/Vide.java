package cells;



public class Vide extends Cellule{
	
	public Vide(int x, int y){
		super(x,y);
	}

	public String toString() {
		return "Cellule Vide [x=" + getX() + ", y=" + getY() + "]";
	}

	@Override
	public boolean isBranche() {
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
	public boolean isBloc() {
		return false;
	}

	@Override
	public int getPoids() {
		return 0;
	}

	@Override
	public boolean isBase() {
		return false;
	}

	@Override
	public String getUrlImg() {
		return "/res/vide.png";
	}
	
	@Override
	public boolean isSupported(){
		return true;
	}
}
