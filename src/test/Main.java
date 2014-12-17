package test;

import model.Contamination;
import model.Radiation;
import model.Mammal;
import model.Batrachian;
import model.Insect;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test de l'abeille qui se balade dans une cuisine :");
		Insect abeille = new Insect(10, 2, "Maya", 4, 10, 0, 2);
		System.out.println(abeille.toString());
		Contamination produitMenager = new Contamination(2, -3);
		produitMenager.contamination(abeille);
		System.out.println(abeille.toString());
		Radiation microOnde = new Radiation(2, -1);
		microOnde.irradiation(abeille);
		System.out.println(abeille.toString());
		System.out.println(abeille.showMutations());

		System.out.println("Test de la grenouille dans une centrale nucleaire :");
		Batrachian grenouille = new Batrachian(12, 2, "Prince", 4, 10, 0);
		System.out.println(grenouille.toString());
		Radiation rayonGamma = new Radiation(5, -1);
		rayonGamma.irradiation(grenouille);
		System.out.println(grenouille.toString());
		Radiation rayonnementCosmique = new Radiation(3, -2);
		rayonnementCosmique.irradiation(grenouille);
		System.out.println(grenouille.toString());
		Radiation RayonAlpha = new Radiation(5, -2);
		RayonAlpha.irradiation(grenouille);
		System.out.println(grenouille.toString());
		System.out.println(grenouille.showMutations());

		System.out.println("Un chaton qui risque de devenir tout mignon :");
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
