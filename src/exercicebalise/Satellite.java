package exercicebalise;

import java.awt.Point;

import nicellipse.component.NiRectangle;

public class Satellite  extends NiRectangle{

	
	private Deplacement d;
	private Point position;
	
	public Satellite() {
		position = new Point(0, 10);
	}
	
	public void setDeplacementPolicy(Deplacement d) {
		this.d = d;
	}
	
	public void move() {
		this.position = d.getNextPosition(position);
		this.setLocation(this.position);
	}
}
