package ca.qc.cgodin;

import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[] args) {
			
		final double TAUX_TPS = 0.05;
		final double TAUX_TVQ = 0.075;

		double prixUnit; 
		double coutAvantTaxes; 

		double coutTotal; // 59$; total aygc taxes

		double totalTPS; // total TPS

		double totalTVQ; // total TVQ

		int qte;

		String saisie;


		saisie = JOptionPane.showInputDialog("Entrer le prix unitaire");
		prixUnit = Double.parseDouble(saisie);

		saisie = JOptionPane.showInputDialog("Entrer la quantite : ");
		qte = Integer.parseInt(saisie);
		
		

		coutAvantTaxes = prixUnit * qte;
		totalTPS = coutAvantTaxes * TAUX_TPS;
		totalTVQ = coutAvantTaxes * TAUX_TVQ;
		coutTotal = coutAvantTaxes + totalTPS + totalTVQ;
		JOptionPane.showMessageDialog(null, "Montant avant taxes : " + coutAvantTaxes + "$"
		+ "\nTotal TPS : " + totalTPS + "$"
		+ "\nTotal TVQ : " + totalTVQ + "$"
		+ "\nTotal apres taxes : " + coutTotal + "$");




	}

}
