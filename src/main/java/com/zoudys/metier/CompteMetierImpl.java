package com.zoudys.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoudys.dao.CompteRepository;
import com.zoudys.entities.Compte;

@Service
public class CompteMetierImpl implements CompteMetier {

	@Autowired
	private CompteRepository compteRepository;
	
	@Override
	public Compte saveCompte(Compte cp) {
		
		return compteRepository.save(cp);
	}

	@Override
	public Compte getCompte(String code) {
		return compteRepository.findOne(code);
	}

}
