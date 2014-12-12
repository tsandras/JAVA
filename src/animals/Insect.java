package animals;

public class Insect extends Animal {
	
	private int wings;
	
	public Insect(String aSt, String mSt, int e, String c, int lg, int lt,
			int mgct, int mstst, int w) {
		super(aSt, mSt, e, c, lg, lt, mgct, mstst);
		w = wings;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	
	public String toString() {
		return "bzzz ! " + super.toString();
	}

}
