package fr.delmaire.pizzeria.pizza.controller;

import org.springframework.ui.Model;

import fr.delmaire.pizzeria.pizza.domain.Pizza;

public interface IPizzaController {

	public String getAll(Model model);
	
	public String infosPizza(Model model, Integer id);
	
	public String supprimer (Model model, Integer id);
	
	public String ajouterUnePizza (Model model);
	
	public String ajouterPizzaValidation (Model model, Pizza newPizza);
	
	public String modifierUnePizza(Model model, Integer id);
	
	public String modifierPizzaValidation(Model model, Pizza p);
	
}
