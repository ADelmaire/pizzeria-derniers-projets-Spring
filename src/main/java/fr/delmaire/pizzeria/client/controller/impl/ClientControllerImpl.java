package fr.delmaire.pizzeria.client.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.delmaire.pizzeria.client.controller.IClientController;
import fr.delmaire.pizzeria.client.domain.Client;
import fr.delmaire.pizzeria.client.service.impl.ClientServiceImpl;

@Controller
public class ClientControllerImpl implements IClientController{
	Logger log = LoggerFactory.getLogger(ClientControllerImpl.class);

	@Autowired ClientServiceImpl cs;

	@Override
	@GetMapping("/clients")
	public String getAll(Model model) {
	List<Client> liste = cs.findAll();
	log.info("taille du tableau cients ==> {}", liste.size());
	model.addAttribute("clients", liste);
		return "clients/clients-accueil";
	}

	@Override
	@GetMapping("/client-infos")
	public String getOneClient(Model model, @RequestParam ("id") Integer id) {
		Client c = cs.findOneClient(id);
		model.addAttribute("client", c);
		return "clients/client-infos";
	}

	@Override
	@GetMapping("/supprimerCl")
	public String supprimerClient(Model model, @RequestParam ("id")Integer id) {
		cs.supprimerCl(id);
		return "redirect:/clients";
	}

	@Override
	@GetMapping("/ajouterClient")
	public String ajouterClient(Model model) {
		Client cl = new Client();
		model.addAttribute("c", cl);
		return "clients/ajouter-client";
	}

	@Override
	@PostMapping("/ajouter-client")
	public String ajouterClientValidation(Model model, @ModelAttribute Client c) { //c du html th:object
		cs.ajouterCl(c);
		return "redirect:/clients";
	}

	@Override
	@GetMapping("/modifierCl")
	public String modifierClient(Model model, @RequestParam ("id") Integer id) {
		Client cl = cs.findOneClient(id);
		model.addAttribute("c", cl);
		return "clients/modifier-client";
	}

	@Override
	@PostMapping("/modifier-client")
	public String modifierClientValidation(Model model, @ModelAttribute("c") Client clt) {
		cs.modifierCl(clt);
		return "redirect:/clients";
	}
	
}
