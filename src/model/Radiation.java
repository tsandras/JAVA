package model;

import utils.RandInt;

public class Radiation extends Pollution {
	
	public Radiation(int ld, int h) {
		super(ld, h);
	}
	
	public void irradiation(Animal irradiatedAnimal) {
		int tmp = RandInt.getRandInt(0, super.getDangerLevel());
		Mutation m = new Mutation(tmp);
		irradiatedAnimal.diagnostic(this, m);
	}
}
