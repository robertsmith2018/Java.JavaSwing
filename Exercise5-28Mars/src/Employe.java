import java.text.DecimalFormat;

public class Employe {
	private String numero;
	private String nom;
	private String prenom;
	private double salaire;

	public Employe(String numero, String nom, String prenom, double salaire) {
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00$");
		return numero + " " + nom + " " + prenom + " " + df.format(salaire);
	}
	
	public Employe copie() {
		return new Employe(numero,nom,prenom,salaire);
	}


	public String toCSV() {
		DecimalFormat df = new DecimalFormat("0.00$");
		return numero + ";" + nom + ";" + prenom + ";" + df.format(salaire);
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

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
