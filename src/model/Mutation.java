package model;

public class Mutation {

	private int type;
	private String name;
	
	public Mutation(int t, String n) {
		type = t;
		name = n;
	}
	
	public void setType(int t) {
		this.type = t;
	}
	
	public int getType() {
		return this.type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
