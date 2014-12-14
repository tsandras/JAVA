package model;

public abstract class Pollution {
//	levelDanger between 1 and 5.
	private int levelDanger;
	
	public Pollution(int ld) {
		this.levelDanger = ld;
	}
	
	public int getlDanger() {
		return this.levelDanger;
	}
	
	public void setlDanger(int ld) {
		this.levelDanger = ld;
	}
}
