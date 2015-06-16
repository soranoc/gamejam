package cells;




public class SegmentBranche extends Cellule {

	double coeff;
	
	/**
	 * 
	 * @param nbCases Le nombre de cases qui se trouvent au dessus de la branche
	 */
	public SegmentBranche(int x, int y){
		super(x,y);
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
	@Override
	public int getPoids() {
		return 0;
	}
	@Override
	public boolean isBase() {
		return false;
	}
	
	@Override
	public String toString() {
		return "Cellule ["+getX()+","+getY()+"] segment branche (coef :"+coeff+")";
	}
	

//	@Override
//	public void draw(Graphics2D g2d) {
//		BufferedImage img = null;
//		try {
//		    img = ImageIO.read(getClass().getResourceAsStream("../branche.jpg"));
//		} catch (IOException e) {
//			System.err.println(e.getMessage());
//		}
//		g2d.drawImage(img, y*Properties.SIZE_CELLS, x*Properties.SIZE_CELLS, Properties.SIZE_CELLS, Properties.SIZE_CELLS, null);	
//	}
//	
//	@Override
//	public void mouseHasClicked(MouseEvent e) {
//		System.out.println("G cliké sur "+this);
//	}
	
	@Override
	public String getUrlImg() {
		return "res/branche.jpg";
	}

}
