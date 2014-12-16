package model;

import utils.RandInt;

public class Radiation extends Pollution {
	
	private Animal irradiatedAnimal;
	
	public Radiation(int ld, int h, Animal a) {
		super(ld, h);
		irradiatedAnimal = a;
	}
	
	public Animal getiAnimal() {
		return this.irradiatedAnimal;
	}
	
	public void setiAnimal(Animal a) {
		this.irradiatedAnimal = a;
	}
	
	public void irradiation() {
		int tmp = RandInt.getRandInt(1, super.getDangerLevel());
		Mutation m = new Mutation(tmp);
		this.irradiatedAnimal.diagnostic(this, m);
	}
}
