package com.zoudys.metier;

import java.util.List;

import com.zoudys.entities.Employe;

public interface EmployeMetier {

	public Employe saveEmploye(Employe e);
	public List<Employe> listEmployes();
}
