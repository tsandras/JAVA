package model;

public abstract class Pollution {
//	levelDanger between 1 and 5.
	private int dangerLevel;
	private int hurt;

	public Pollution(int ld, int h) {
		this.dangerLevel = ld;
		this.setHurt(h);
	}

	public int getDangerLevel() { return this.dangerLevel; }
	public int getHurt()        { return hurt; }

	public void setDangerLevel(int ld) { this.dangerLevel = ld; }
	public void setHurt(int hurt)      { this.hurt = hurt; }


}
