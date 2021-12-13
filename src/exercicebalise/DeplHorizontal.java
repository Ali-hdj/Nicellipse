package exercicebalise;

import java.awt.Point;

public class DeplHorizontal implements Deplacement{
	
	int xMin;
	int xMax;
	boolean retour;
	
	public DeplHorizontal(int borneMin, int borneMax) {
		xMin = borneMin;
		xMax = borneMax;
		retour = false;
	}

	@Override
	public Point getNextPosition(Point p) {
		
		if(p.getX() < xMax && retour == false) {
			p = new Point((int)p.getX()+1, (int)p.getY());
		}
		if(p.getX()==xMax) {
			retour = true;
		}
		if(p.getX() > xMin && retour == true) {
			p = new Point((int)p.getX()-1, (int)p.getY());
		}
		if(p.getX() == xMin) {
			retour = false;
		}
		
		return p;
	}
	
}
