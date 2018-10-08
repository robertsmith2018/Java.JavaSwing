public class Exercise3 {

	public static void main(String[] args) {
	
			final double TAUX_TPS = 0.05;
			final double TAUX_TVQ = 0.075;

			double prixUnit; // 95;; gggggigg gg Rroduit aghggg
			double coutAvantTaxes; // 59g; avant taxes

			double coutTotal; // 539; total gxgg taxes

			double totalTPS; // total TPS

			double totalTVQ; // total TVQ

			int qte;

			System.out.print("Entrer Le prix unitaire : ");
			prixUnit = Clavier.lireDouble();
			System.out.print("Entrer la quantite : ");

			qte = Clavier.lireInt();
			

			coutAvantTaxes = prixUnit * qte;

			totalTPS = coutAvantTaxes * TAUX_TPS;

			totalTVQ = coutAvantTaxes * TAUX_TVQ;

			coutTotal = coutAvantTaxes + totalTPS + totalTVQ;

			System.out.printf("Montant avant taxes : %.2f$\nTotal TPS :%.2f$\n"+

			"Total TVQ : %.2f$\nTota1 apres taxes : %.2f$",
			coutAvantTaxes, totalTPS, totalTVQ, coutTotal);

			



	}

}
