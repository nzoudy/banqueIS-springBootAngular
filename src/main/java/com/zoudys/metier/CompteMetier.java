package com.zoudys.metier;

import com.zoudys.entities.Compte;

public interface CompteMetier {
	
	public Compte saveCompte(Compte cp);
	public Compte getCompte(String code);
}
