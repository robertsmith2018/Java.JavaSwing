package doW;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class doW {

	public static void main(String[] args) {
		char reponse; // boucle de traitement
		char qNbre;
		int somme = 0, nombre=0;
		
		do { // traitement quelconque
			nombre = Integer.parseInt(JOptionPane.showInputDialog("Veuillez Entrez Votre Nombre SVP"));
			somme = somme + nombre;
			qNbre = JOptionPane.showInputDialog( "Voulez-vous Entrer Un Autre Nombre (O/N) ?").charAt(0);						
		} while (qNbre != 'N');
		
		JOptionPane.showMessageDialog(null, "La Somme des Nombres que vous avez entrer est: "+ somme);
		reponse = JOptionPane.showInputDialog( "Voulez-vous recommencer (O/N) ?").charAt(0);
		if(reponse == 'N'){
			System.exit(0);
		}

	}

}
