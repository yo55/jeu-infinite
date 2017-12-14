
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
	
	
	public orientPiece rotation() {
		this._rotation();
		
		switch (this.cap) {
		case 0:
			return NORD;
		case 90:
			return EST;
		case 180:
			return SUD;
		case 270:
			return OUEST;
		default:
			return NORD;
		}
	}
	
	// tourne la pièce de 90° à droite
	private void _rotation() {
		if (cap < 270) {
			this.cap += 90;
		}else{
			this.cap = 0;
		}
	}
}
