package fr.delmaire.pizzeria.client.service;

import java.util.List;

import fr.delmaire.pizzeria.client.domain.Client;

public interface IClientService {

	public List<Client> findAll();
	
	public Client findOneClient(Integer id);
	
	public void supprimerCl (Integer id);
	
	public void ajouterCl (Client client);
	
	public void modifierCl (Client client);
	
}
