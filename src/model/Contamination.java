package model;

public class Contamination extends Pollution {
	
	private Animal contaminatedAnimal;
	
	public Contamination(int ld, int h, Animal a) {
		super(ld, h);
	}
	
	public Animal getcAnimal() {
		return this.contaminatedAnimal;
	}
	
	public void setcAnimal(Animal a) {
		this.contaminatedAnimal = a;
	}
	
	public void contamination() {
		this.contaminatedAnimal.diagnostic(this);
	}
}
