package model;

public class Contamination extends Pollution {
	
	public Contamination(int ld, int h, String n) {
		super(ld, h, n);
	}
	
	public void contamination(Animal contaminatedAnimal) {
		contaminatedAnimal.diagnostic(this);
	}
}
