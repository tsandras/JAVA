package model;

import java.util.List;

public class Batrachian extends Animal {

	public Batrachian(int l, String mSt, int e, String c, int lg,
			int mgct, int mstst, List<Mutation> muts) {
		super(l, mSt, e, c, lg, mgct, mstst, muts);
	}
	
	public String toString() {
		return "koak ! " + super.toString();
	}

}
