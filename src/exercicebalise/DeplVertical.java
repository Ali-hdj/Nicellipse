package exercicebalise;

import java.awt.Point;

public class DeplVertical implements Deplacement{
	
	int yMin;
	int yMax;

	public DeplVertical(int borneMin, int borneMax) {
		yMin = borneMin;
		yMax = borneMax;
	}
	
	@Override
	public Point getNextPosition(Point p) {
		if (p.getY() < yMax - p.getY()) {
			p = new Point((int)p.getX(), (int)p.getY()+1);
		}
		if(p.getY() > yMin) {
			p = new Point((int)p.getX(), (int)p.getY()-1);
		}
		return p;
	}
}
