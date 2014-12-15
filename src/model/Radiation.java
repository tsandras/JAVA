package model;

import java.util.Random;

public class Radiation extends Pollution {
	
	private Animal irradiatedAnimal;
	
	public Radiation(int ld, Animal a) {
		super(ld);
		irradiatedAnimal = a;
	}
	
	public Animal getiAnimal() {
		return this.irradiatedAnimal;
	}
	
	public void setiAnimal(Animal a) {
		this.irradiatedAnimal = a;
	}
	
	public void irradiation() {
//		Plus le niveau de danger est important plus l'animal peut subir des mutations dangeureuses.
		int tmp = randInt(1, super.getDangerLevel());
		Mutation m = new Mutation(tmp);
		this.irradiatedAnimal.diagnostic(m);
	}
	
	private int randInt(int min, int max) {
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;
	}
}