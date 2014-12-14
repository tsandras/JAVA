package model;

public class Mutation {

	private int type;
	private String name;
//	Pour l'instant "Nom;Gain/Perte de monstrueusite;Gain/Perte de mignoncite;Gain/perte de vie/descrption"
	private static final String[] MUTATIONS = new String[]{
		"Grandie;2;-1;2;beaucoup plus grand!", 
		"Luminaissance;2;2;0;est luminaissant", 
		"Tentacule;3;1;1;a une tentacule!", 
		"Cancer;4;-4;-4;ne se sent pas tres bien..",
		"Liquefaction;6;-5;-10;a les cellules qui commencent a se liquifier!"};
	
	public Mutation(int t) {
		type = t;
		name = getNameOfMutation(t);
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
		return "Je suis une mutation de type "+this.type+" et mon nom est "+this.name+"";
	}
	
	private String getNameOfMutation(int t) {
		String[] tmp = MUTATIONS[t].split(";");
		return tmp[0];
	}
}
