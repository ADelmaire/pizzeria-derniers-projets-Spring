package fr.delmaire.pizzeria.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.delmaire.pizzeria.client.domain.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer>{

}
