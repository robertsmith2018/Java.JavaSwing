package ca.qc.ca;

public class Contact {
	private String nom;
	private String prenom;
	private double salaire;
	
	public Contact(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		
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

}
