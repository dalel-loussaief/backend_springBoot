package com.example.vetements.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idG;
	private String nom;
	private String description;
	private String taille;
	
	@OneToMany(mappedBy = "genre")
	@JsonIgnore
	private List<Vetement> vetements;

	
	
	
	public Genre(String nom, String description, String taille, List<Vetement> vetements) {
		super();
		this.nom = nom;
		this.description = description;
		this.taille = taille;
		this.vetements = vetements;
	}

	public Genre() {
		super();
		
	}

	public Long getIdG() {
		return idG;
	}

	public void setIdG(Long idG) {
		this.idG = idG;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public List<Vetement> getVetements() {
		return vetements;
	}

	public void setVetements(List<Vetement> vetements) {
		this.vetements = vetements;
	}

	@Override
	public String toString() {
		return "Genre [idG=" + idG + ", nom=" + nom + ", description=" + description + ", taille=" + taille
				+ ", vetements=" + vetements + "]";
	}

	
	
	
	
}
