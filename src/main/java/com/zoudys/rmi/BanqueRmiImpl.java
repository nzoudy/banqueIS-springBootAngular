package com.zoudys.rmi;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zoudys.entities.Compte;
import com.zoudys.metier.CompteMetier;
import com.zoudys.metier.OperationMetier;

@Component("myRmiService")
public class BanqueRmiImpl implements BanqueRmiRemote{

	@Autowired
	private CompteMetier compteMetier;
	@Autowired
	private OperationMetier operationMetier;
	
	@Override
	public Compte saveCompte(Compte cp) throws RemoteException {
		// TODO Auto-generated method stub
		return compteMetier.saveCompte(cp);
	}

	@Override
	public Compte getCompte(String code) throws RemoteException {
		// TODO Auto-generated method stub
		return compteMetier.getCompte(code);
	}

	@Override
	public boolean verser(String code, double montant, Long codeEmp) throws RemoteException {
		// TODO Auto-generated method stub
		return operationMetier.verser(code, montant, codeEmp);
	}

	@Override
	public boolean retirer(String code, double montant, Long codeEmp) throws RemoteException {
		// TODO Auto-generated method stub
		return operationMetier.retirer(code, montant, codeEmp);
	}

	@Override
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) throws RemoteException {
		// TODO Auto-generated method stub
		return operationMetier.virement(cpte1, cpte2, montant, codeEmp);
	}

}
