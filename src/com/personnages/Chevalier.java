package com.personnages;

public class Chevalier extends Personnage {

	@Override
	public void combattre() {
		System.out.println("le chevalier va combattre avec..." + arme.utiliserArme());

	}

}
