package ca.qc.rassaker;

import java.util.StringTokenizer;

public class Contact {
	private String nom;
	private String prenom;
	private String phone;
	private String address;
	private String codePostal;
	private String ville;
	private String pays;
	
	private double note;
	private int age;
	
	public Contact(String nom, String prenom, String phone, String address, String codePostal, String ville, String pays, double note, int age) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.phone = phone;
		this.address = address;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.note = note;
		this.age = age;
	}
	
	public Contact(String csv){  // surcharger le constructeur
		StringTokenizer tokens = new StringTokenizer(csv, ";");
		this.nom = tokens.nextToken();
		this.prenom = tokens.nextToken();
		this.phone = tokens.nextToken();
		this.address = tokens.nextToken();
		this.codePostal = tokens.nextToken();
		this.ville = tokens.nextToken();
		this.pays = tokens.nextToken();
		this.note = Double.parseDouble(tokens.nextToken());
		this.age = Integer.parseInt(tokens.nextToken());
	}

	public String toString() {
		return  nom + " "+ prenom +" " + phone + " " + age +" " +address+" "+ codePostal +" " + ville + " " + pays + " " + note;
	}

	public String toCSV(){
		return  nom + "; "+ prenom +";" + phone + ";" +address+";"+ codePostal +";" + ville + ";" + pays + ";" + note + ";" + age ;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




}
