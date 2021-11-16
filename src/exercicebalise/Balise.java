package exercicebalise;

import nicellipse.component.NiRectangle;
import java.awt.Point;

public class Balise extends NiRectangle{

	private Deplacement d;
	private Point position;
	
	public Balise() {
		position = new Point(0, 0);
	}
	
	public void setDeplacementPolicy(Deplacement d) {
		this.d = d;
	}
	
	public void move() {
		this.position = d.getNextPosition(position);
		this.setLocation(this.position);
	}
}
