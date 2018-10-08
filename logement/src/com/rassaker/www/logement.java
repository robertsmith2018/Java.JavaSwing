package com.rassaker.www;

import javax.swing.JOptionPane;

public class logement {

	public static void main(String[] args) {
		char codeLogement;
		String saisie;
		String messageSortie; 
		saisie = JOptionPane.showInputDialog(
		"Entrez votre code de logement : P ou L ou E ou X");
		codeLogement = saisie.charAt(0);
		
		switch(codeLogement){
		case'P':
			messageSortie = "Vous etes propriétaire";
			JOptionPane.showMessageDialog(null, messageSortie);
			break;
		case'L':
			messageSortie = "Vous etes locataire";
			JOptionPane.showMessageDialog(null, messageSortie);
			break;
		case'E':
		
		case'X':
			messageSortie = "Vous habitez chez vos parents";
	
		JOptionPane.showMessageDialog(null, messageSortie);
		System.exit(0);

		}
	}

}
