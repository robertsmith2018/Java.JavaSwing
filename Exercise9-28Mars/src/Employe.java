public class Employe implements Comparable<Employe> {
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

	public int compareTo(Employe autre) {
		int valeurRetour;
		if (this.salaire == autre.salaire)

		{
			valeurRetour = 0;
		} else if (this.salaire < autre.salaire) {
			valeurRetour = -1;
		} else {
			return 1;
		}
		return valeurRetour;
	}

	@Override
	public String toString() {
		return "Employe [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
}
