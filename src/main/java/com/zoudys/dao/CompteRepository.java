package com.zoudys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
