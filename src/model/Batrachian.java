package model;

import java.util.List;

public class Batrachian extends Animal {

	public Batrachian(int l, String aSt, String mSt, int e, String c, int lg, int lt,
			int mgct, int mstst, List<Mutation> muts) {
		super(l, aSt, mSt, e, c, lg, lt, mgct, mstst, muts);
	}
	
	public String toString() {
		return "koak ! " + super.toString();
	}

}
