package model;

public class Mutation {

	private int    type;
	private String name;
	private String description;
	private int    mutationMonst;
	private int    mutationMignon;

	private static final String[] MUTATIONS = new String[]{
		"croissance;2;-1;est beaucoup plus grand !",
		"luminescence;2;4;est luminescent",
		"tentacule;3;2;a une tentacule !",
		"poil rose;2;5;a des poiles roses",
		"cancer;4;-4;ne se sent pas tres bien..",
		"liquefaction;6;-5;a les cellules qui commencent a se liquifier !"};

	public Mutation(int t) {
		type 		   = t;
		name           = getMutationNameCSV(t);
		description    = getMutationDescriptionCSV(t);
		mutationMonst  = getMutationMonstCSV(t);
		mutationMignon = getMutationMignonCSV(t);
	}


	public int getType()           { return this.type; }
	public String getName()        { return name; }
	public String getDescription() { return description; }
	public int getMutationMonst()  { return mutationMonst; }
	public int getMutationMignon() { return mutationMignon; }


	public void setType(int t)                        { this.type = t; }
	public void setName(String name)                  { this.name = name; }
	public void setDescription(String description)    { this.description = description; }
	public void setMutationMonst(int mutationMonst)   { this.mutationMonst = mutationMonst; }
	public void setMutationMignon(int mutationMignon) { this.mutationMignon = mutationMignon; }


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

	private String getMutationDescriptionCSV(int t) {
		String[] tmp = MUTATIONS[t].split(";");
		return tmp[3];
	}

	public String toString() {
		String str = "Je suis une mutation de type "+this.type+" et mon nom est "+this.name+".";
		if (this.mutationMonst < 0) {
			str+= " Je vais faire perdre "+this.mutationMonst+" points en monstruausite.";
		} else {
			str+= " Je vais faire gagner "+this.mutationMonst+" points en monstruausite.";
		}
		if (this.mutationMignon < 0) {
			str+= " Je vais faire perdre "+this.mutationMignon+" points en mignoncite.\n";
		} else {
			str+= " Je vais faire gagner "+this.mutationMignon+" points en mignoncite.\n";
		}
		str += "Notre petit ami " + this.description + " :)";
		return str;
	}

	public String showDescription() {
		return this.description;
	}

}
