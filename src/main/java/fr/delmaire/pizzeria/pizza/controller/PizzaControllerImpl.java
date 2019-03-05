package fr.delmaire.pizzeria.pizza.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.delmaire.pizzeria.pizza.domain.Pizza;
import fr.delmaire.pizzeria.pizza.service.impl.PizzaServiceImpl;

@Controller
public class PizzaControllerImpl implements IPizzaController{
	Logger log = LoggerFactory.getLogger(PizzaControllerImpl.class);
	
	@Autowired
	private PizzaServiceImpl pizzaService;
	
	@Override
	@RequestMapping("/pizzas")
	public String getAll(Model model) {
	List<Pizza> liste = pizzaService.findAll();
	model.addAttribute("pizzas", liste);
		return "pizzas/pizzas";
	}

	@Override
	@GetMapping("/pizza-info")
	public String infosPizza(Model model, @RequestParam("id") Integer id) {
		log.info("ID ={}", id);
		Pizza p = pizzaService.findOnePizza(id);
				log.debug("Description:{}", p.getDescription());
				log.warn("l'url de la pizza : {}", p.getPhoto());
		model.addAttribute("pizza", p);
		return "pizzas/pizza-infos";
	}

	@Override
	@GetMapping("/supprimer")
	public String supprimer(Model model, @RequestParam ("id") Integer id) {
			pizzaService.supprimer(id);
		return "redirect:/pizzas";
	}

	@Override
	@GetMapping("/ajouter")
	public String ajouterUnePizza(Model model) {
		Pizza p = new Pizza();
		model.addAttribute("newPizza", p);
		return "pizzas/ajouter-pizza";
	}

	@Override
	@PostMapping("/ajouter-pizza")
	public String ajouterPizzaValidation(Model model, @ModelAttribute Pizza newPizza) {
		pizzaService.ajouterPizza(newPizza);
		return "redirect:/pizzas";
	}

	@Override
	@GetMapping ("/modifier")
	public String modifierUnePizza(Model model, @RequestParam ("id") Integer id) {
		Pizza p = pizzaService.findOnePizza(id);
		model.addAttribute("p", p);
		return "pizzas/modifier-pizza";
	}

	@Override
	@PostMapping("modifier-pizza")
	public String modifierPizzaValidation(Model model, @ModelAttribute("p") Pizza p) {
		pizzaService.modifierPizza(p);
		return "redirect:/pizzas";
	}

}
