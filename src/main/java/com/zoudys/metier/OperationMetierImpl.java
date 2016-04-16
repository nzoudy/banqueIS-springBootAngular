package com.zoudys.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zoudys.dao.OperationRepository;
import com.zoudys.dao.CompteRepository;
import com.zoudys.entities.Compte;
import com.zoudys.entities.Versement;
import com.zoudys.entities.Retrait;
import com.zoudys.entities.Employe;
import com.zoudys.entities.Operation;
import com.zoudys.dao.EmployeRepository;

@Service
public class OperationMetierImpl implements OperationMetier {
	
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	@Transactional
	public boolean verser(String code, double montant, Long codeEmp) {
		Compte cp=compteRepository.findOne(code);
		Employe e=employeRepository.findOne(codeEmp);
		
		Operation o = new Versement();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		
		// penser à mettre à jour le solde
		cp.setSolde(cp.getSolde()+montant);
		
		return true;
	}

	@Override
	@Transactional
	public boolean retirer(String code, double montant, Long codeEmp) {
		Compte cp=compteRepository.findOne(code);
		if(cp.getSolde() < montant) {
			throw new RuntimeException("Solde insuffisant");
		}
		Employe e=employeRepository.findOne(codeEmp);
		Operation o = new Retrait();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		// penser à mettre à jour le solde
		cp.setSolde(cp.getSolde()-montant);
		
		return true;
	}

	@Override
	@Transactional
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) {
		retirer(cpte1, montant, codeEmp);
		verser(cpte2, montant, codeEmp);
		return true;
	}

	@Override
	public PageOperation getOperations(String codeCompte, int page, int size) {
		
		Page<Operation> ops = operationRepository.getOperations(codeCompte, new PageRequest(page, size));
		
//		Compte cp=compteRepository.findOne(codeCompte);
//		Page<Operation> ops2 = operationRepository.findByCompte(cp, new PageRequest(page, size));
		
		PageOperation pageOperation = new PageOperation();
		pageOperation.setOperations(ops.getContent());
		pageOperation.setNombreOperations(ops.getNumberOfElements());
		pageOperation.setPage(ops.getNumber());
		pageOperation.setTotalPage(ops.getTotalPages());
		pageOperation.setTotalOperations((int)ops.getTotalElements());
		return pageOperation;
	}

}
