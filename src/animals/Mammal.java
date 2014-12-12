package animals;

public class Mammal extends Animal {
	
	public Mammal(String aSt, String mSt, int e, String c, int lg, int lt,
			int mgct, int mstst) {
		super(aSt, mSt, e, c, lg, lt, mgct, mstst);
	}

	public void meow() {
		setMignoncite(getMignoncite() + 1);
	}
	
	public String toString() {
		return "meow ! " + super.toString(); 
	}

}
