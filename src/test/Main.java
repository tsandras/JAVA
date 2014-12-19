package test;

import org.junit.Test;

import model.Contamination;
import model.Radiation;
import model.Mammal;
import model.Batrachian;
import model.Insect;

public class Main {

	@Test public static void main(String[] args) {
		//////////////// Test 1 ////////////////
		System.out.println("Test de l'abeille qui se balade dans une cuisine :");
		Insect abeille = new Insect(10, 2, "noirs", 4, 10, 0, 2);
		System.out.println(abeille.toString());
		
		Contamination produitMenager = new Contamination(2, -3, "produit menager");
		produitMenager.contamination(abeille);
		System.out.print("Contamination par : ");
		System.out.println(produitMenager.toString());
		System.out.println(abeille.toString());
		
		Radiation microOndes = new Radiation(2, -1, "micro-ondes");
		microOndes.irradiation(abeille);
		System.out.print("Contamination par : ");
		System.out.println(microOndes.toString());
		System.out.println(abeille.toString());
		
		System.out.println(abeille.showMutations());

		//////////////// Test 2 ////////////////
		System.out.println("Test de la grenouille dans une centrale nucleaire :");
		Batrachian grenouille = new Batrachian(12, 2, "verts", 4, 10, 0);
		System.out.println(grenouille.toString());
		
		Radiation rayonGamma = new Radiation(5, -1, "rayon gamma");
		rayonGamma.irradiation(grenouille);
		System.out.println(grenouille.toString());
		
		Radiation rayonnementCosmique = new Radiation(3, -2, "rayonnement cosmique");
		rayonnementCosmique.irradiation(grenouille);
		System.out.println(grenouille.toString());
		
		Radiation RayonAlpha = new Radiation(5, -2, "rayon alpha");
		RayonAlpha.irradiation(grenouille);
		System.out.println(grenouille.toString());
		
		System.out.println(grenouille.showPollutions());
		System.out.println(grenouille.showMutations());
		
		//////////////// Test 3 ////////////////
		System.out.println("Un chaton qui risque de devenir tout mignon :");
		Mammal chaton = new Mammal(12, 2, "bleux", 4, 10, 0);
		System.out.println(chaton.toString());
		
		Radiation croquetteMagique = new Radiation(3, -1, "croquette magique");
		croquetteMagique.irradiation(chaton);
		System.out.println(chaton.toString());
		
		Radiation laitJaponais = new Radiation(3, -2, "lait japonais");
		laitJaponais.irradiation(chaton);
		System.out.println(chaton.toString());
		
		Radiation croquetteMagique2 = new Radiation(3, -1, "autre croquette magique");
		croquetteMagique2.irradiation(chaton);
		
		System.out.println(chaton.showPollutions());
		System.out.println(chaton.showMutations());
		
		//////////////// Test 4 ////////////////
		System.out.println("Un chien qui va mourrir");
		Mammal chien = new Mammal(10, 2, "noir", 4, 4, 0);
		System.out.println(chien.toString());
		
		Contamination gamelleArsenique = new Contamination(3, -4, "arsenique");
		gamelleArsenique.contamination(chien);
		System.out.print("Contamination par : ");
		System.out.println(gamelleArsenique.toString());
		System.out.println(chien.toString());

		Contamination roundup = new Contamination(3, -6, "roundup");
		roundup.contamination(chien);
		System.out.print("Contamination par : ");
		System.out.println(roundup.toString());
		System.out.println(chien.toString());
	}
}
