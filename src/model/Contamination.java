package model;

public class Contamination extends Pollution {
	
	private Animal contaminatedAnimal;
	
	public Contamination(int ld, Animal a) {
		super(ld);
	}
	
	public Animal getcAnimal() {
		return this.contaminatedAnimal;
	}
	
	public void setcAnimal(Animal a) {
		this.contaminatedAnimal = a;
	}
}
