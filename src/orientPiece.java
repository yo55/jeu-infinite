
public enum orientPiece {

	NORD(0),
	SUD(180),
	EST(90),
	OUEST(270);
		
	private int cap;
	
	private orientPiece (int cap)
	{
		this.cap = cap;
	}
	
	public int getCap() {
		return this.cap;
	}
}
