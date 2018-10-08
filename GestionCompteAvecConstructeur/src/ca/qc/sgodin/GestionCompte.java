package ca.qc.sgodin;

import javax.swing.JOptionPane;

public class GestionCompte {

	public static void main(String[] args) {
		
		String numeroCompte = JOptionPane.showInputDialog(null, "Entrer le numéro de compte");
		String typeCompte = JOptionPane.showInputDialog(null, "Entrer le type de compte");
		String deviseCompte = JOptionPane.showInputDialog(null, "Entrer la devise de compte");
		String saisie = JOptionPane.showInputDialog(null, "Entrer le solde de compte");
		double soldeCompte = Double.parseDouble(saisie);
		
		Compte c1 = new Compte(numeroCompte, typeCompte, soldeCompte, deviseCompte);

	/*	c1.creer(numeroCompte, typeCompte, soldeCompte, deviseCompte);*/
		c1.afficher();
	    System.out.print(c1.toString());
	
		
	}

}
