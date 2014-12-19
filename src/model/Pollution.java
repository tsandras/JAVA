package model;

public abstract class Pollution {
//	levelDanger between 1 and 5.
	private int dangerLevel;
	private int hurt;
	private String name;

	public Pollution(int ld, int h, String n) {
		this.dangerLevel = ld;
		this.setHurt(h);
		this.setName(n);
	}

	public int getDangerLevel() { return this.dangerLevel; }
	public int getHurt()        { return hurt; }
	public String getName()     { return name; }
	
	public void setDangerLevel(int ld) { this.dangerLevel = ld; }
	public void setHurt(int hurt)      { this.hurt = hurt; }
	public void setName(String name)   { this.name = name; }

	public String toString() {
		return this.name;
	}
}
