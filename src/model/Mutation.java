package model;

public class Mutation {

	private int type;
	private String name;
	private String description;
	private int mutationLife;
	private int mutationMonst;
	private int mutationMignon;
//	Pour l'instant "Nom;Gain/Perte de monstruausite;Gain/Perte de mignoncite;Gain/perte de vie/description"
	private static final String[] MUTATIONS = new String[]{
		"Grandit;2;-1;2;est beaucoup plus grand!", 
		"Luminescence;2;2;0;est luminescent", 
		"Tentacule;3;1;1;a une tentacule!", 
		"Cancer;4;-4;-4;ne se sent pas tres bien..",
		"Liquefaction;6;-5;-10;a les cellules qui commencent a se liquifier!"};
	
	public Mutation(int t) {
		type 		   = t;
		name           = getMutationNameCSV(t);
		description    = getMutationDescriptionCSV(t);
		mutationLife   = getMutationLifeCSV(t);
		mutationMonst  = getMutationMonstCSV(t);
		mutationMignon = getMutationMignonCSV(t);
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
	
	public String toString() {
		return "Je suis une mutation de type "+this.type+" et mon nom est "+this.name+".`"
				+ "Je vais faire perdre/gagner "+this.mutationLife+" vie."
				+ "Je vais faire perdre/gagner "+this.mutationMonst+" en monstruausite."
				+ "Je vais faire perdre/gagner "+this.mutationMignon+" en mignoncite.";
	}
	
	public String showDescription() {
		return this.description;
	}
	
	private String getMutationNameCSV(int t) {
		String[] tmp = MUTATIONS[t].split(";");
		return tmp[0];
	}
	
	private int getMutationMonstCSV(int t) {
		String[] tmp = MUTATIONS[t].split(";");
		return Integer.parseInt(tmp[1]);
	}
	
	private int getMutationMignonCSV(int t) {
		String[] tmp = MUTATIONS[t].split(";");
		return Integer.parseInt(tmp[2]);
	}
	
	private int getMutationLifeCSV(int t) {
		String[] tmp = MUTATIONS[t].split(";");
		return Integer.parseInt(tmp[3]);
	}
	
	private String getMutationDescriptionCSV(int t) {
		String[] tmp = MUTATIONS[t].split(";");
		return tmp[4];
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMutationLife() {
		return mutationLife;
	}

	public void setMutationLife(int mutationLife) {
		this.mutationLife = mutationLife;
	}

	public int getMutationMonst() {
		return mutationMonst;
	}

	public void setMutationMonst(int mutationMonst) {
		this.mutationMonst = mutationMonst;
	}

	public int getMutationMignon() {
		return mutationMignon;
	}

	public void setMutationMignon(int mutationMignon) {
		this.mutationMignon = mutationMignon;
	}
}
