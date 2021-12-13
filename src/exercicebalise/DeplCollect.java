package exercicebalise;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class DeplCollect  implements Deplacement {

	
	
	int tempDepl=1000;
	
	
	int compteur=0;
	
	int numDepl=0;
	List<Deplacement> listDeplacement =new ArrayList<>();
	
	
	
	
	
	public void ajouterDeplacement(Deplacement depl)
	{
		this.listDeplacement.add(depl);
		
	}
	
	@Override
	public Point getNextPosition(Point p) {
	this.compteur+=1;
	
	if(compteur>this.tempDepl)
	{
		numDepl++;
	}
	
	
	if(numDepl>this.listDeplacement.size()-1)
	{
		this.numDepl=0;
	}
	
	
		
		return this.listDeplacement.get(numDepl).getNextPosition(p);
	}

	
	
}
