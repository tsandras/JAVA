package model;

import java.util.List;

public class Insect extends Animal {

	private int wings;

	public Insect(int l, String mSt, int e, String c, int lg,
			int mgct, int mstst, List<Mutation> muts, int w) {
		super(l, mSt, e, c, lg, mgct, mstst, muts);
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
