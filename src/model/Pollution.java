package model;

public abstract class Pollution {
//	levelDanger between 1 and 5.
	private int dangerLevel;
	
	public Pollution(int ld) {
		this.dangerLevel = ld;
	}
	
	public int getDangerLevel() {
		return this.dangerLevel;
	}
	
	public void setDangerLevel(int ld) {
		this.dangerLevel = ld;
	}
}
