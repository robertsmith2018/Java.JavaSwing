package ca.qc.cgodin;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
	
		final double TAUX_TPS = 0.05, 
					 TAUX_TVQ = 9.975;
				double prixUnit, coutAvantTaxes; 
				int qte; 
				
		System.out.println("Veuillez Entrer Le Prix Unitaire SVP :");
		Scanner sc = new Scanner(System.in);
		prixUnit = sc.nextDouble();
		//System.out.println(prixUnit);
			
		System.out.println("Veuillez Entrer La Qty SVP :");	
		qte = sc.nextInt();
		
		coutAvantTaxes = prixUnit * qte;
		System.out.println(coutAvantTaxes);

	}

}
