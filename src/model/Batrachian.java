package model;

public class Batrachian extends Animal {

	public Batrachian(int l, int e, String c, int lg, int mgct, int mstst) {
		super(l, e, c, lg, mgct, mstst);
	}
	
	public String toString() {
		return "koak ! " + super.toString();
	}

}
