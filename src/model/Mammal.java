package model;

public class Mammal extends Animal implements IHealing {
	
	public Mammal(int l, int e, String c, int lg, int mgct, int mstst) {
		super(l, e, c, lg, mgct, mstst);
	}

	public void healLife() {
		setLife(getLife() + 3);
	}
	
	public void meow() {
		System.out.println("Meow !");
		setMignoncite(getMignoncite() + 1);
		if (getMignoncite() > 5) {
			this.healLife();
		}
	}
	
	public String toString() {
		return "Meow ! " + super.toString(); 
	}

}
