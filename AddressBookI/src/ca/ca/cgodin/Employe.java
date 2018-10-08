package ca.ca.cgodin;

import java.util.StringTokenizer;

public class Employe {
	private String nom;
	private String prenom;
	double salaire;
	
	public Employe(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		
	}
	
	public Employe(String csv) {
		StringTokenizer tokens = new StringTokenizer(csv, ";");
		this.nom = tokens.nextToken();
		this.prenom = tokens.nextToken();
		this.salaire = Double.parseDouble(tokens.nextToken());	
	}
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public String toString() {
		return nom + " "+ prenom + " "+ salaire;
	}
	
	public String toCSV() {
		return nom + ";" +prenom+";"+ salaire;

	}

}
