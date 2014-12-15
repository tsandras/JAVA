package model;

import java.util.List;
import java.util.ArrayList;

import state.AnimalStateMachine;
import state.EAnimalState;
import state.IStateHealth;

public abstract class Animal implements IStateHealth {

	private int    life;
	private EAnimalState animalState;
	private String mutationState;
	private int    eyes;
	private String color;
	private int    legs;
	private int    mignoncite;
	private int    monstruausite;
	
//	private static final String[] ANIMALSTATE = new String[]{
//		"Bonne sante", 
//		"Malade", 
//		"Etat critique", 
//		"Mort"};
	
	private static final String[] MUTATIONSTATE = new String[]{
		"Normal", 
		"Etrange creature", 
		"Monstre", 
		"Cthulhesque",
		"Kawahi"};

	private List<Mutation> mutations = new ArrayList<Mutation>();

	public Animal(int l, String mSt, int e, String c,
			int lg, int mgct, int mstst, List<Mutation> muts) {
		life          = l;
		animalState   = EAnimalState.GOOD_HEALTH;
		mutationState = mSt;
		eyes          = e;
		color         = c;
		legs          = lg;
		mignoncite    = mgct;
		monstruausite = mstst;
		mutations     = muts;
	}

	public EAnimalState getState()							{return this.animalState;}
	public void setState(EAnimalState state)					{this.animalState = state;}
	
	public EAnimalState getAnimalState() {
		return animalState;
	}

//	on a qu'a dire qu'on a pour l'instant l'etat "Bonne sante", "Malade", "Etat critique", "Mort"
	public void setAnimalState(EAnimalState aState) {
		this.animalState = aState;
	}

	public String getMutationState() {
		return mutationState;
	}

	
//	temporairement : Etat "Parfait", "Cool", "Etrange creature", "Monstre", "Cthulhesque" 
	public void setMutationState(String mState) {
		this.mutationState = mState;
		
	}

	public void diagnostic(Mutation m) {
		calculateStates(m);
		addMutation(m);
	}
	
//	Quand il y a une modification qui peut changer l'etat..
	private void calculateStates(Mutation m) {
//		To do : logic for state machine
		attributesUpdate(m);
//		On commence par animalState
		AnimalStateMachine.changeStep(this);
		if (this.mutationState != MUTATIONSTATE[0] && this.monstruausite > 3) {
			this.mutationState = MUTATIONSTATE[0];
		}
		if (this.mutationState != MUTATIONSTATE[0] && this.mignoncite >= 9 
				&& this.monstruausite >= 3 && this.monstruausite <= 6) {
			this.mutationState = MUTATIONSTATE[4];
		}
	}
	
	private void attributesUpdate(Mutation m) {
		this.life = this.life + m.getMutationLife();
		this.mignoncite = this.mignoncite + m.getMutationMignon();
		this.monstruausite = this.monstruausite + m.getMutationMonst();
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
