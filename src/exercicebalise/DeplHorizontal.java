package exercicebalise;

import java.awt.Point;

public class DeplHorizontal implements Deplacement{
	
	int xMin;
	int xMax;
	
	public DeplHorizontal(int borneMin, int borneMax) {
		xMin = borneMin;
		xMax = borneMax;
	}

	@Override
	public Point getNextPosition(Point p) {
		if (p.getX() < xMax - p.getX()) {
			p = new Point((int)p.getX()+1, (int)p.getY());
		}
		if(p.getX() > xMin) {
			p = new Point((int)p.getX()-1, (int)p.getY());
		}
		return p;
	}
	
}
