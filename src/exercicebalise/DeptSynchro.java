package exercicebalise;

import java.awt.Point;

public class DeptSynchro implements Deplacement {


	
	
	int yMin;
	int yMax;

	public DeptSynchro(int borneMin, int borneMax) {
		yMin = borneMin;
		yMax = borneMax;
	}
	
	@Override
	public Point getNextPosition(Point p) {
		if (p.getY() > yMax) {
			p = new Point((int)p.getX(), (int)p.getY()-1);
		}
		
		return p;
	}
}
