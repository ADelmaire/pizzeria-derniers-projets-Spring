package fr.delmaire.pizzeria.client.controller;

import org.springframework.ui.Model;

import fr.delmaire.pizzeria.client.domain.Client;

public interface IClientController {

	public String getAll(Model model);
	
	public String getOneClient (Model model, Integer id);
	
	public String supprimerClient (Model model, Integer id);
	
	public String ajouterClient (Model model);
	
	public String ajouterClientValidation (Model model, Client c);
	
	public String modifierClient (Model model, Integer id);
	
	public String modifierClientValidation (Model model, Client clt);
	
}
