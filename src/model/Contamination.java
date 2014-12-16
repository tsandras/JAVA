package model;

public class Contamination extends Pollution {
	
	public Contamination(int ld, int h) {
		super(ld, h);
	}
	
	public void contamination(Animal contaminatedAnimal) {
		contaminatedAnimal.diagnostic(this);
	}
}
