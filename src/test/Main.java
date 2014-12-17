package test;

import model.Contamination;
import model.Radiation;
import model.Mammal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test du chaton qui se balade dans une central nucleaire :");
		Mammal chaton = new Mammal(10, 2, "Blues", 4, 10, 0);
		System.out.println(chaton.toString());
		Contamination produitMenager = new Contamination(2, -3);
		produitMenager.contamination(chaton);
		System.out.println(chaton.toString());
		Radiation microOnde = new Radiation(2, -1);
		microOnde.irradiation(chaton);
		System.out.println(chaton.toString());
		System.out.println(chaton.showMutations());
		
		System.out.println("Test du chaton dans une central nucleaire :");
		Mammal chaton2 = new Mammal(12, 2, "Blues", 4, 10, 0);
		System.out.println(chaton2.toString());
		Radiation rayonGamma = new Radiation(5, -1);
		rayonGamma.irradiation(chaton2);
		System.out.println(chaton2.toString());
		Radiation rayonnementCosmique = new Radiation(3, -2);
		rayonnementCosmique.irradiation(chaton2);
		System.out.println(chaton2.toString());
		Radiation RayonAlpha = new Radiation(5, -2);
		RayonAlpha.irradiation(chaton2);
		System.out.println(chaton2.toString());
		System.out.println(chaton2.showMutations());
		
		System.out.println("Un chaton qui risque de devenir tout mignion :");
		Mammal chaton3 = new Mammal(12, 2, "Blues", 4, 10, 0);
		System.out.println(chaton3.toString());
		Radiation croquetteMagique = new Radiation(3, -1);
		croquetteMagique.irradiation(chaton3);
		System.out.println(chaton3.toString());
		Radiation laitJaponais = new Radiation(3, -2);
		laitJaponais.irradiation(chaton3);
		System.out.println(chaton3.toString());
		Radiation croquetteMagique2 = new Radiation(3, -1);
		croquetteMagique2.irradiation(chaton3);
		System.out.println(chaton3.showMutations());
	}
}
