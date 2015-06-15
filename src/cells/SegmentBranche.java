package cells;



public class SegmentBranche extends Cellule {
	Cellule[] cells;
	private double coeff;
	
	/**
	 * 
	 * @param nbCases Le nombre de cases qui se trouvent au dessus de la branche
	 */
	public SegmentBranche(int x, int y){
		super(x,y);
		cells = new Cellule[y];
		remplirCells();
	}
	/**
	 * Remplit le tableau avec des cellules vides
	 */
	private void remplirCells() {
		for(int i=0; i<cells.length; ++i){
			cells[i]=new Vide();
		}
		
	}
	@Override
	public boolean isBranche() {
		return true;
	}

	@Override
	public boolean isBloc() {
		return false;
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

	public double getCoeff() {
		return coeff;
	}

	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}
	
	/**
	 * 
	 * @return Le poids total de ce qui se trouve sur la branche
	 */
	public double getPoidsTotal(){
		int poids=0;
		for(int i=0; i<cells.length;++i){
			poids = poids + cells[i].getPoids();
		}
		return coeff*poids;
	}
	
	public void ajouterBloc(Cellule bloc){
		for(int i=0; i<cells.length;++i){
			if(cells[i].isEmpty()){
				cells[i]=bloc;
				break;
			}
		}
	}

	public Cellule[] getCells() {
		return cells;
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
