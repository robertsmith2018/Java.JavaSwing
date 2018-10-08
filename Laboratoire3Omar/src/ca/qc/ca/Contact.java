package ca.qc.ca;

import java.util.StringTokenizer;

public class Contact {
private String nom;	
private String prenom;	
private int age;
private String telephone;
private String adresse;
private String codePostal;
private String ville;
private String pays;
private double note;

public Contact(String nom, String prenom, int age, String telephone, String adresse, String codePostal, String ville,
		String pays, double note) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.telephone = telephone;
	this.adresse = adresse;
	this.codePostal = codePostal;
	this.ville = ville;
	this.pays = pays;
	this.note = note;
}

public Contact(String csv)
  {
	StringTokenizer tokens = new StringTokenizer(csv, ";");
	this.nom = tokens.nextToken();
	this.prenom = tokens.nextToken();
	this.age = Integer.parseInt(tokens.nextToken());
	this.telephone = tokens.nextToken();
	this.adresse = tokens.nextToken();
	this.codePostal = tokens.nextToken();
	this.ville = tokens.nextToken();
	this.pays = tokens.nextToken();
	this.note = Double.parseDouble(tokens.nextToken());
  }


@Override
public String toString() {
	return nom + " " + prenom + " " + age + " " + telephone + " " + 
           adresse + " " + codePostal + " " + ville + " " + pays + " " + note;
}


public String toCSV()
{
	return nom + ";" + prenom + ";" + age + ";" + telephone + ";" + 
	           adresse + ";" + codePostal + ";" + ville + ";" + pays + ";" + note;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
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


}
