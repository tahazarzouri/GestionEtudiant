package com.gestionEtudiant.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.gestionEtudiant.entity.Etudiant;

public class Principale {

	static List<Etudiant> listEtudiant = new ArrayList<Etudiant>();
	static Scanner sr = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		int choix = 0;
		String nom = null;
		String prenom = null;
		String email = null;
		String dateString = null;
		Date date = null;
		String civilite = null;
		// TODO Auto-generated method stub
		do {
		System.out.println("***************** menu****************" + "\nPour  ajouter un Etudiant Cliquez :1"
				+ "\n Pour Afficher la list des Etudiant Cliquez :2" + "\npour Supprimer un Etudiant Cliquez :3"
				+ "\n Pour trier la list des Etudiants par nom ascendant Cliquez :4"
				+ "\n Pour trier la list des Etudiants par date de naissance descendant Cliquez :5");
		
		
			choix = sr.nextInt();

		switch (choix) {
		case 1:
				 System.out.println("entrer le nom d'etudiant");
				 nom = sr.next();
				System.out.println("entrer le prenom d'etudiant");
				 prenom = sr.next();
				System.out.println("entrer le email d'etudiant");
				 email = sr.next();
				System.out.println("entrer la date Naissance  d'etudiant");
				 dateString = sr.next();
				SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
				 date = format.parse(dateString);
				System.out.println("civilite [Monsieu , Madame]");
				 civilite = sr.next();
				ajouterEtudiant(nom, prenom, email, date, civilite);


			break;

			case 2:

				listerEtdudiant();
				break;

			case 3:
				System.out.println("entrer le nom d'etudiant");
				nom = sr.next();
				supprimerEtudiant(nom);
				break;

			case 4:
				trierParNomAsc();
				break;
			case 5:
				trierParDatedesc();
				break;

		}
		} while (choix != 6);
	}

	public static void ajouterEtudiant(String nom, String prenom, String email, Date date, String civilite) {

		listEtudiant.add(new Etudiant(nom, prenom, email, date, civilite));

	}

	public static void listerEtdudiant() {

		listEtudiant.forEach(s -> System.out.println(s.toString()));

	}

	public static void supprimerEtudiant(String nom) {

		listEtudiant.removeIf(x -> x.getNom().equals(nom));

	}

	public static void trierParNomAsc() {

		listEtudiant.stream().sorted(Comparator.comparing(Etudiant::getNom, String.CASE_INSENSITIVE_ORDER))
				.forEach(s -> System.out.println(s));
	}

	public static void trierParDatedesc() {

		listEtudiant.stream().sorted(Comparator.comparing(Etudiant::getDateNaissance).reversed())
				.forEach(s -> System.out.println(s));
	}
}
