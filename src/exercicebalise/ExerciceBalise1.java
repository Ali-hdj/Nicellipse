package exercicebalise;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import nicellipse.component.NiRectangle;
import nicellipse.component.NiSpace;

public class ExerciceBalise1 {

	public static void main(String[] args) throws InterruptedException {
		NiSpace space = new NiSpace("Exercice balise", new Dimension(600, 400));
		Satellite sat1 = new Satellite();
		
		Ocean ocean=new Ocean("ocean",new Dimension(600,200));
		ocean.setBackground(Color.blue);
		ocean.setSize(600,200);
		ocean.setLocation(new Point(0, 200));
		
		
		
		Balise balise1=new Balise(0,50);
		Balise balise2=new Balise(100,100);
		Balise balise3=new Balise(300,150);
		

		balise1.setBackground(Color.yellow);
		balise2.setBackground(Color.yellow);
		balise3.setBackground(Color.yellow);
		
		balise1.setSize(40,40);
		balise2.setSize(40,40);
		balise3.setSize(40,40);
		
		DeplCollect dp1=new DeplCollect();
		DeplCollect dp2=new DeplCollect();
		dp1.ajouterDeplacement(new DeplHorizontal(0, 600));
		dp1.ajouterDeplacement(new DeplVertical(0,160));
		dp1.ajouterDeplacement(new DeplHorizontal(0, 400));
		
		dp2.ajouterDeplacement(new DeplVertical(60,160));
		dp2.ajouterDeplacement(new DeplHorizontal(30, 600));
		dp2.ajouterDeplacement(new DeplVertical(50,160));
		dp2.ajouterDeplacement(new DeplHorizontal(0, 400));
		dp2.ajouterDeplacement(new DeptSynchro(0, 0));
		dp1.ajouterDeplacement(new DeptSynchro(0, 0));
		dp2.ajouterDeplacement(new DeptSynchro(0, 0));
		dp1.ajouterDeplacement(new DeptSynchro(0, 0));
		
		balise1.setDeplacementPolicy(dp1);
		balise2.setDeplacementPolicy(dp2);
		balise3.setDeplacementPolicy(dp1);
		
		
		space.setBackground(Color.lightGray);
		sat1.setBackground(Color.red);
		sat1.setSize(60, 30);
		space.add(sat1);
		space.add(ocean);
		ocean.add(balise1);
		ocean.add(balise2);
		ocean.add(balise3);
		
		
		sat1.setDeplacementPolicy(new DeplHorizontal(0, 600));

		
		space.openInWindow();
		
		while (true) {
			sat1.move();
			balise1.move();
			balise2.move();
			balise3.move();
			Thread.sleep(10);
		}
	}

}
