package fr.delmaire.pizzeria.pizza.service;

import java.util.List;

import fr.delmaire.pizzeria.pizza.domain.Pizza;

public interface IPizzaService {
	
public List<Pizza> findAll();

public Pizza findOnePizza (Integer id);

public void supprimer (Integer id);

public void ajouterPizza (Pizza pizz);

public void modifierPizza (Pizza pz);

}
