package com.zoudys.metier;

import java.util.List;

import com.zoudys.entities.Client;

public interface ClientMetier{

	public Client saveClient(Client c);
	public List<Client> listClient();
}
