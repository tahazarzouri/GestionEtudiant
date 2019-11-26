package com.gestionEtudiant.entity;

import java.util.Date;

/**
 * 
 * 
 * 
 * 
 * @author Taha
 *
 */
public class Etudiant {

	private String nom;
	private String prenom;
	private String email;
	private Date dateNaissance;
	private Civilite civilite;

	public Etudiant(String nom2, String prenom2, String email2, Date date, String civilite2) {
		// TODO Auto-generated constructor stub
		this.nom = nom2;
		this.prenom = prenom2;
		this.email = email2;
		this.dateNaissance = date;

		if (civilite2.equalsIgnoreCase("Monsieu")) {
			this.civilite = Civilite.Monsieu;
		} else {
			this.civilite = Civilite.Madame;
		}
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", dateNaissance=" + dateNaissance
				+ ", civilite=" + civilite + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}



}
