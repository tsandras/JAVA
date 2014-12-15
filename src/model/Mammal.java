package model;

import java.util.List;

public class Mammal extends Animal implements IHealing {
	
	public Mammal(int l, String aSt, String mSt, int e, String c, int lg,
			int mgct, int mstst, List<Mutation> muts) {
		super(l, aSt, mSt, e, c, lg, mgct, mstst, muts);
	}
	
	public int healLife() {
		return 10;
	}

	public void meow() {
		setMignoncite(getMignoncite() + 1);
		if (getMignoncite() > 10) {
			this.healLife();
		}
	}
	
	public String toString() {
		return "Meow ! " + super.toString(); 
	}

}
