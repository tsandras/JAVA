package model;

import java.util.List;
import java.util.ArrayList;

public abstract class Animal {

	private int    life;
	private String animalState;
	private String mutationState;
	private int    eyes;
	private String color;
	private int    legs;
	private int    litter;
	private int    mignoncite;
	private int    monstruausite;

	private List<Mutation> mutations = new ArrayList<Mutation>();

	public Animal(int l, String aSt, String mSt, int e, String c,
			int lg, int lt, int mgct, int mstst, List<Mutation> muts) {
		life          = l;
		animalState   = aSt;
		mutationState = mSt;
		eyes          = e;
		color         = c;
		legs          = lg;
		litter        = lt;
		mignoncite    = mgct;
		monstruausite = mstst;
		mutations     = muts;
	}

	public String getaState() {
		return animalState;
	}

//	on a qu'a dire qu'on a pour l'instant l'etat "Bonne sante", "Malade", "Etat critique"
	public void setaState(String aState) {
		this.animalState = aState;
	}

	public String getmState() {
		return mutationState;
	}

//	temporairement : Etat "Cool", "Etrange creature", "Monstre", "Cthulhesque" 
	public void setmState(String mState) {
		this.mutationState = mState;
	}

//	Quand il y a une modification qui peut changer l'etat..
	public void calculateStates() {
		// To do
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

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public List<Mutation> getMutations() {
		return mutations;
	}

	public void setMutations(List<Mutation> mutations) {
		this.mutations = mutations;
	}
	
	public void addMutation(Mutation mutation) {
		this.mutations.add(mutation);
	}

}
