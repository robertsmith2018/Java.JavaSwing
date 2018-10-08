package ca.qc.sgodin;

import javax.swing.JOptionPane;

public class TestCompte {

	public static void main(String[] args) {
		
		String numeroCompte = JOptionPane.showInputDialog(null, "Entrer le numéro de compte");
		String typeCompte = JOptionPane.showInputDialog(null, "Entrer le type de compte");
		String deviseCompte = JOptionPane.showInputDialog(null, "Entrer la devise de compte");
		String saisie = JOptionPane.showInputDialog(null, "Entrer le solde de compte");
		double soldeCompte = Double.parseDouble(saisie);
		
		Compte c1 = new Compte(numeroCompte,typeCompte, soldeCompte,deviseCompte);
		System.out.println("Compte 1 : "+ c1);
		
		System.out.println("Compte 1 : "+c1.getNumero()+" "+c1.getType()+
		" "+c1.getSolde()+" "+c1.getDevise());
	
		
	}

}
