package fr.delmaire.pizzeria.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.delmaire.pizzeria.client.domain.Client;
import fr.delmaire.pizzeria.client.repository.IClientRepository;
import fr.delmaire.pizzeria.client.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService{
	
	@Autowired IClientRepository cr;

	@Override
	public List<Client> findAll() {
		List<Client> liste = cr.findAll();
		return liste;
	}

	@Override
	public Client findOneClient(Integer id) {
		Client cl = cr.getOne(id);
		return cl;
	}

	@Override
	public void supprimerCl(Integer id) {
	cr.deleteById(id);
	}

	@Override
	public void ajouterCl(Client client) {
		cr.save(client);
	}

	@Override
	public void modifierCl(Client client) {
		cr.save(client);
	}
	

}
