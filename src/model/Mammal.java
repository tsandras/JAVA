package model;

public class Mammal extends Animal implements IHealing {
	
	public Mammal(int l, int e, String c, int lg, int mgct, int mstst) {
		super(l, e, c, lg, mgct, mstst);
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
