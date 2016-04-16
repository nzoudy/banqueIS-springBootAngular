package com.zoudys.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoudys.dao.ClientRepository;
import com.zoudys.entities.Client;

@Service
public class ClientMetierImpl implements ClientMetier {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Client saveClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		return clientRepository.findAll();
	}

}
