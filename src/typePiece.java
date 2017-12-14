
public enum typePiece {
	
	TERMINAL(1, 232),
	TUBE(2, 186),
	COUDE(2, 188),
	T3(3, 185),
	T4(4, 206);
	
	// nombre de connecteurs
	private int nbConnections;
	
	// Caractère ascii de référence (orientation NORD)
	private int extAsciiRefSymbol;
	
	private typePiece (int nbC, int symbol) {
		this.nbConnections = nbC;
		this.extAsciiRefSymbol = symbol;
	}
	
	public int getNbExtr() {
		return nbConnections;
	}
	
	public int getRefSymbol() {
		return extAsciiRefSymbol;
	}
}
