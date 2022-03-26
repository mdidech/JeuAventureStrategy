package com.app;

import com.armes.ComportementArcEtFleches;
import com.armes.ComportementHache;
import com.armes.ComportementPoignard;
import com.personnages.Chevalier;
import com.personnages.Personnage;
import com.personnages.Reine;
import com.personnages.Roi;

public class App {

	public static void main(String[] args) {
		Personnage p1, p2, p3;
		p1 = new Chevalier();
		p1.setArme(new ComportementHache());
		p1.combattre();
		p2 = new Roi();
		p2.setArme(new ComportementArcEtFleches());
		p2.combattre();
		p3 = new Reine();
		p3.setArme(new ComportementPoignard());
		p3.combattre();
	}

}
