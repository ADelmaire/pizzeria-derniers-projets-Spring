package fr.delmaire.pizzeria.client.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	
	@Column(name="ID")
	private Integer id;

	@Column(name="NUMERO")
	private Integer numero;

	@Column(name="NOM")
	private String nom;

	@Column(name="PRENOM")
	private String prenom;

	@Column(name="VILLE")
	private String ville;

	@Column(name="DATE_DE_NAISSANCE")
	@DateTimeFormat(pattern="dd-mm-yyyy")
	private String dateDeNaissance;

	@Column(name="ADRESSE")
	private String adresse;

	@Column(name="CODE_POSTAL")
	private String codePostal;

	@Column(name="EMAIL")
	private String email;

	@Column(name="PHONE")
	private String phone;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
