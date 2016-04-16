package com.zoudys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
