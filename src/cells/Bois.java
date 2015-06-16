package cells;



public class Bois extends Cellule {
	


	public Bois (int x, int y){
		super(x,y);
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
	
	@Override
	public String toString() {
		return "Cellule ["+getX()+","+getY()+"] bois";
	}

	@Override
	public String getUrlImg() {
		return "res/bloc_bois.png";
	}


}
