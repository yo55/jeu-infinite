import java.util.ArrayList;
import java.util.List;


public class Bouton {
	
	
	private String nom;
	private int posX;
	private int posY;
	
	private static List<Bouton> InstanceList = new ArrayList<Bouton>();
	
	public Bouton(String nom, int x, int y) {
		this.nom = nom;
		this.posX = x;
		this.posY = y;
		
		this.InstanceList.add(this);
		
	}
	
	
}
