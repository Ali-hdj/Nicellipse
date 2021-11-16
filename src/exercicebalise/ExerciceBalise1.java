package exercicebalise;

import java.awt.Color;
import java.awt.Dimension;

import nicellipse.component.NiRectangle;
import nicellipse.component.NiSpace;

public class ExerciceBalise1 {

	public static void main(String[] args) {
		NiSpace space = new NiSpace("Exercice balise", new Dimension(200, 150));
		Balise balise = new Balise();
		space.setBackground(Color.lightGray);
		balise.setBackground(Color.red);
		balise.setSize(20, 20);
		space.add(balise);
		balise.setDeplacementPolicy(new DeplHorizontal(0, 200));

		space.openInWindow();
		
		while (true) {
			balise.move();
		}
	}

}
