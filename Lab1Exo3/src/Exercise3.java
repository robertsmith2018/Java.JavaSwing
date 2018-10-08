
public class Exercise3 {

	public static void main(String[] args) {
		
		final double TAUX_TPS = 0.05, // les constantes pour les taux
				TAUX_TVQ = 9.975;
				double prixUnit, // prix unitaire du produit acheté
				coutAvantTaxes, // coût avant taxes
				coutTotal; // coût total avec taxes
				int qte; // quantité du produit acheté
				String saisie;
				
				
		System.out.println("Veuillez Entrez le Prix Unitaire");
		prixUnit = Clavier.lireDouble();
		System.out.printf("Le Prix Unitaire est : % 4f\n", prixUnit);	
		
		System.out.println("Veuillez Entrez la Qty");
		qte = Clavier.lireInt();
		
		coutAvantTaxes = prixUnit * qte;
		coutTotal = coutAvantTaxes * (1 + TAUX_TPS) * (1 + TAUX_TVQ);
		
		System.out.printf("La Qte % 4d", qte);
		
		
		
		
	}

}
