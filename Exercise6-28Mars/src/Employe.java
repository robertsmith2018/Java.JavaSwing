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
	
/*	public boolean equals(Employe autre){
	
		return ( this.numero.equals(autre.numero) &&
		this .nom.equals(autre .nom) &&
		this .prenom.equals(autre .prenom) &&
		this .salaire == autre .salaire ) ;
	}*/
	public String toCSV() {
		DecimalFormat df = new DecimalFormat("0.00$");
		return numero + ";" + nom + ";" + prenom + ";" + df.format(salaire);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * Cette Méthode est générer automatiquement et remplace la première méthode:
	 * public boolean equals(Employe autre){..........}*/
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (Double.doubleToLongBits(salaire) != Double.doubleToLongBits(other.salaire))
			return false;
		return true;
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
