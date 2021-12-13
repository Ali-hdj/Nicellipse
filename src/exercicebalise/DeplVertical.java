package exercicebalise;

import java.awt.Point;

public class DeplVertical implements Deplacement{
	
	int yMin;
	int yMax;

	boolean retour;
	
	public DeplVertical(int borneMin, int borneMax) {
		yMin = borneMin;
		yMax = borneMax;
		retour = false;
	}
	
	@Override
	public Point getNextPosition(Point p) {
		if(p.getY() < yMax && retour == false) {
			p = new Point((int)p.getX(), (int)p.getY()+1);
		}
		if(p.getY()==yMax) {
			retour = true;
		}
		if(p.getY() > yMin && retour == true) {
			p = new Point((int)p.getX(), (int)p.getY()-1);
		}
		if(p.getY() == yMin) {
			retour = false;
		}
		return p;
	}
}
