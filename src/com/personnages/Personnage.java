package com.personnages;

import com.armes.ComportementArme;

public abstract class Personnage {
	ComportementArme arme;

	public void setArme(ComportementArme arme) {
		this.arme = arme;
	}

	public abstract void combattre();

}
