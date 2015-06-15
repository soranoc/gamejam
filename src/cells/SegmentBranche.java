package cells;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class SegmentBranche extends Cellule {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Cellule[] cells;
	private double coeff;
	
	/**
	 * 
	 * @param nbCases Le nombre de cases qui se trouvent au dessus de la branche
	 */
	public SegmentBranche(int x, int y){
		super(x,y);
		add(new JLabel(new ImageIcon("./res/branche.jpg")));
		cells = new Cellule[y];
		remplirCells();
		setVisible(true);
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
	public int getPoids() {
		return 0;
	}
	@Override
	public boolean isBase() {
		return false;
	}

}
