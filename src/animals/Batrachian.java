package animals;

public class Batrachian extends Animal {

	public Batrachian(String aSt, String mSt, int e, String c, int lg, int lt,
			int mgct, int mstst) {
		super(aSt, mSt, e, c, lg, lt, mgct, mstst);
	}
	
	public String toString() {
		return "koak ! " + super.toString();
	}

}
