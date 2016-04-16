package com.zoudys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
