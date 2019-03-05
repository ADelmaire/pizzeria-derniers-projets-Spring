package fr.delmaire.pizzeria.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.delmaire.pizzeria.pizza.domain.Pizza;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Integer>//clé primaire
{

}
