
package ca.qc.cgodin;

import javax.swing.JOptionPane;

public class Exercise7 {

	public static void main(String[] args) {

		char choix;
		String menu;
		String saisie;

		menu =  "o) Ouvrir un fichier\n";

		menu += "n) Nouveau fichier\n";

		menu += "p) Imprimer le fichier\n";

		menu += "f) Fermer le fichier\n";

		menu += "s) Sauvegarder le fichier\n";

		menu += "q) Quitter 1e programme\n";

		saisie = JOptionPane.showInputDialog(menu);
		choix = saisie.charAt(0);

		switch (choix) {
		case 'o':
		case 'O': {
			JOptionPane.showMessageDialog(null, "Ouvrir un fichier");
		}
			break;
		case 'n':
		case 'N': {
			JOptionPane.showMessageDialog(null, "Nouveau fichier");
		}
			break;

		case 'p':
		case 'P': {
			JOptionPane.showMessageDialog(null, "Imprimer le fichier");
		}

			break;
		case 'f':
		case 'F': {
			JOptionPane.showMessageDialog(null, "Fermer le fichier");
		}

			break;
		case 's':
		case 'S': {
			JOptionPane.showMessageDialog(null, "Sauvegarder le fichier");
		}

			break;
		case 'q':
		case 'Q': {
			JOptionPane.showMessageDialog(null, "Quitter le programme");
		}
		default: {
			JOptionPane.showMessageDialog(null, "Choix invalide");

		}

		}
	}
}
