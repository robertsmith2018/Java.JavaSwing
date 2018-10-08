package ca.qc.cgg;
import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[] args) {
		
		final double TAUX_TPS = 0.05, // les constantes pour les taux
				TAUX_TVQ = 9.975;
				// prix unitaire du produit acheté
				double coutAvantTaxes; // coût avant taxes
				double coutTotal; // coût total avec taxes
			
				String saisie;
				
				
		
		String prixUnit = JOptionPane.showInputDialog("Veuillez Entrer Le Prix Unitaire SVP :");
		
		double prixUn = Double.parseDouble(prixUnit);
		System.out.println(prixUn);
		
		String qte = JOptionPane.showInputDialog("Veuillez Entrer La Qty SVP :");
		int qty = Integer.parseInt(qte);
		System.out.println(qty);
		
				
		coutAvantTaxes = prixUn * qty;
		coutTotal = coutAvantTaxes * (1 + TAUX_TPS) * (1 + TAUX_TVQ);
		
		System.out.println("Montant avant taxes "+ coutAvantTaxes);
		System.out.println(coutTotal);
		
		
				


	}

}
