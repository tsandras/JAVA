package animals;

public class Animal {
	
	private String animalState;
	private String mutationState;
	private int eyes;
	private String color;
	private int legs;
	private int litter;
	private int mignoncite;
	private int monstruausite;
	
	public Animal(String aSt, String mSt, int e, String c,
			int lg, int lt, int mgct, int mstst) {
		aSt = animalState;
		mSt = mutationState;
		e = eyes;
		c = color;
		lg = legs;
		lt = litter;
		mgct = mignoncite;
		mstst = monstruausite;
	}

	public String getaState() {
		return aState;
	}

	public void setaState(String aState) {
		this.aState = aState;
	}

	public String getmState() {
		return mState;
	}

	public void setmState(String mState) {
		this.mState = mState;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLitter() {
		return litter;
	}

	public void setLitter(int litter) {
		this.litter = litter;
	}

	public int getMignoncite() {
		return mignoncite;
	}

	public void setMignoncite(int mignoncite) {
		this.mignoncite = mignoncite;
	}

	public int getMonstruausite() {
		return monstruausite;
	}

	public void setMonstruausite(int monstruausite) {
		this.monstruausite = monstruausite;
	}

	public String toString() {
		return "Je suis un animal " + this.animalState + ", j'ai " + this.legs + "pattes, " + this.eyes +
				" yeux et je suis " + this.mutationState + " :)";
	}

}
