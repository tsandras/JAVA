package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

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
	
	private static final String[] ANIMALSTATE = new String[]{
		"Bonne sante", 
		"Malade", 
		"Etat critique", 
		"Mort"};
	
	private static final String[] MUTATIONSTATE = new String[]{
		"Normal", 
		"Etrange creature", 
		"Monstre", 
		"Cthulhesque",
		"Kawahi"};

	private List<Mutation> mutations = new ArrayList<Mutation>();

	public Animal(int l, int e, String c, int lg, int mgct, int mstst) {
		life          = l;
		animalState   = EAnimalState.GOOD_HEALTH;
		mutationState = MUTATIONSTATE[0];
		eyes          = e;
		color         = c;
		legs          = lg;
		mignoncite    = mgct;
		monstruausite = mstst;
	}

	public EAnimalState getState()							{return this.animalState;}
	public void setState(EAnimalState state)					{this.animalState = state;}
	
	public EAnimalState getAnimalState() {
		return animalState;
	}

	public void setAnimalState(EAnimalState aState) {
		this.animalState = aState;
	}

	public String getMutationState() {
		return mutationState;
	}
 
	public void setMutationState(String mState) {
		this.mutationState = mState;
		
	}

	public void diagnostic(Pollution p) {
		this.life = this.life + p.getHurt();
		calculateStateAnimal();
	}
	
	public void diagnostic(Pollution p, Mutation m) {
		this.life = this.life + p.getHurt();
		attributesUpdate(m);
		calculateStateAnimal();
		calculateMutationState(m);
		addMutation(m);
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
	
	public String showMutations() {
		Iterator<Mutation> iter = this.mutations.iterator();
		String out = "Cette animal a comme mutation :\n";
		while (iter.hasNext()) {
			Mutation m = iter.next();
			out += m.toString()+"\n";
		}
		return out;
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
	
	private void attributesUpdate(Mutation m) {
		this.mignoncite = this.mignoncite + m.getMutationMignon();
		this.monstruausite = this.monstruausite + m.getMutationMonst();
	}
	
	private void calculateStateAnimal() {
		if (this.life < 8) {
			AnimalStateMachine.changeStep(this);
		}
		if (this.animalState.getState() != ANIMALSTATE[3] && this.life <= 0) {
			this.animalState = EAnimalState.DEAD;
		}
	}
	
	private void calculateMutationState(Mutation m) {
		if (this.mutationState == MUTATIONSTATE[0]) {
			manageMutationState0(m);
		} else if (this.mutationState == MUTATIONSTATE[1]) { 
			manageMutationState1(m);
		} else if (this.mutationState == MUTATIONSTATE[2]) {
			if (m.getMutationMonst() > 2 && this.monstruausite > 8) {
				this.mutationState = MUTATIONSTATE[3];
			}
		}
	}
	
	private void manageMutationState0(Mutation m) {
		if (m.getMutationMonst() > 2 && this.monstruausite > 5) {
			this.mutationState = MUTATIONSTATE[2];
		} else if (m.getMutationMonst() > 2 && this.monstruausite > 2) {
			this.mutationState = MUTATIONSTATE[1];
		}
	}
	
	private void manageMutationState1(Mutation m) {
		if (m.getMutationMonst() > 2 && this.monstruausite > 8) {
			this.mutationState = MUTATIONSTATE[3];
		} else if (m.getMutationMonst() > 2 && this.monstruausite < 6) {
			this.mutationState = MUTATIONSTATE[4];
		}
	}
}
