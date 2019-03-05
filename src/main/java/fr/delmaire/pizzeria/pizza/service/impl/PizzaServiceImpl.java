package fr.delmaire.pizzeria.pizza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.delmaire.pizzeria.pizza.domain.Pizza;
import fr.delmaire.pizzeria.pizza.repository.IPizzaRepository;
import fr.delmaire.pizzeria.pizza.service.IPizzaService;

@Service
public class PizzaServiceImpl implements IPizzaService{
	@Autowired
	private IPizzaRepository pizzaRepository;

	@Override
	public List<Pizza> findAll() {
		List<Pizza> liste = pizzaRepository.findAll();
		return liste;
	}

	@Override
	public Pizza findOnePizza(Integer id) {
		Pizza p = pizzaRepository.getOne(id);
		return p;
	}

	@Override
	public void supprimer(Integer id) {
		pizzaRepository.deleteById(id);
	}

	@Override
	public void ajouterPizza(Pizza pizz) {
		pizzaRepository.save(pizz);
	}

	@Override
	public void modifierPizza(Pizza pz) {
		pizzaRepository.save(pz);
		
	}
}
