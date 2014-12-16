package model;

public class Insect extends Animal {

	private int wings;

	public Insect(int l, int e, String c, int lg, int mgct, int mstst, int w) {
		super(l, e, c, lg, mgct, mstst);
		wings = w;
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
