package ca.qc.ggodin;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		
		final double TAUX_TPS = 0.05;
		final double TAUX_TVQ = 0.075;

		double prixUnit; // 95;; ggigaigg gg groduit achggg
		double coutAvantTaxes; // 59g; avant taxes

		double coutTotal; // 59g; total axgg taxes

		double totalTPS; // total TPS

		double totalTVQ; // total Tvq

		int qte;

		// ligg prixUnit g; gte
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrer le prix unitaire : ");
		prixUnit = sc.nextDouble();
		System.out.print("Entrer la quantite : ");

		qte = sc.nextInt();
		

		coutAvantTaxes = prixUnit * qte;

		totalTPS = coutAvantTaxes * TAUX_TPS;

		totalTVQ = coutAvantTaxes * TAUX_TVQ;

		coutTotal = coutAvantTaxes + totalTPS + totalTVQ;

		System.out.println("Montant avant taxes : " + coutAvantTaxes + "$"
		+ "\nTotal TPS : " + totalTPS
		+ "\nTotal TVQ : " + totalTVQ

		+ "\nTotal apres taxes : " + coutTotal);




	}

}
