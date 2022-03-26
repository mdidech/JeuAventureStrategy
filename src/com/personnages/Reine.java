package com.personnages;

public class Reine extends Personnage {

	@Override
	public void combattre() {
		System.out.println("la reine va combattre avec..." + arme.utiliserArme());

	}

}
