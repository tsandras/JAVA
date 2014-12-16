package test;

import model.Contamination;
import model.Radiation;
import model.Mammal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		Un petit chaton se balade dans la cuisine...
		Mammal chaton = new Mammal(10, 2, "Blues", 4, 10, 0);
		System.out.println(chaton.toString());
		Contamination produitMenager = new Contamination(2, -3);
		produitMenager.contamination(chaton);
		System.out.println(chaton.toString());
		Radiation microOnde = new Radiation(2, -1);
		microOnde.irradiation(chaton);
		System.out.println(chaton.toString());
	}
}
