public class Piece {

	private int extremites;

	public Piece (int extr) {
		this.extremites = extr;
	}

	public String toString() {
		return "" + this.extremites;
	}
	
	public int getNature() {
		return this.extremites;
	}
	
	public void setNature(int nat) {
		this.extremites = nat;
	}



}




