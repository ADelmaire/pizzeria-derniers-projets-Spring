package fr.delmaire.pizzeria.pizza.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizza")

public class Pizza {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ID")
private Integer id;
	
	@Column(name="LIBELLE")
private String libelle;
	
	@Column(name="REFERENCE")
private String reference;
	
	@Column(name="PRIX")
private Integer prix;
	
	@Column(name="PHOTO")
private String photo;
	
	@Column(name="DESCRIPTION")
private String description;
	
	@Column(name="NUMERO")
private Integer numero;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public String getReference() {
	return reference;
}
public void setReference(String reference) {
	this.reference = reference;
}
public Integer getPrix() {
	return prix;
}
public void setPrix(Integer prix) {
	this.prix = prix;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Integer getNumero() {
	return numero;
}
public void setNumero(Integer numero) {
	this.numero = numero;
}


}
