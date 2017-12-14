
public enum typePiece {
	
	TUBE(2),
	COUDE(2),
	T3(3),
	T4(4);
	
	private int nbConnections;
	
	private typePiece (int nbC) {
		this.nbConnections = nbC;
	}
	
	public int getNbExtr() {
		return nbConnections;
	}
}
