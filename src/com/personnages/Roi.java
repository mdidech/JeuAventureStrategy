package com.personnages;

public class Roi extends Personnage {

	@Override
	public void combattre() {
		System.out.println("le roi va combattre avec..." + arme.utiliserArme());

	}

}
