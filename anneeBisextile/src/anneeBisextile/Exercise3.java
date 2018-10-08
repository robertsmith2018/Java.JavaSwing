package anneeBisextile;

import javax.swing.JOptionPane;

public class Exercise3 {

	public static void main(String[] args) {

		int jour;
		int mois;
		int annee;
		do {
			jour = Integer.parseInt(JOptionPane.showInputDialog("Entrer le jour"));
			mois = Integer.parseInt(JOptionPane.showInputDialog("Entrer le mois"));
			annee = Integer.parseInt(JOptionPane.showInputDialog("Entrerl'année"));
			if (annee != 0) {
				if (estValide(jour, mois, annee)) {
					JOptionPane.showMessageDialog(null, "La date est valide");
				} else {
					JOptionPane.showMessageDialog(null, "La date est invalide");
				}
			}
		} while (annee != 0);
	}

	public static boolean estBissextile(int annee) {
		boolean bissextile = true;
		if (annee % 4 != 0) {
			bissextile = false;
		} else if ((annee % 100 == 0) && (annee % 400 != 0)) {
			bissextile = false;
		}
		return bissextile;
	}

	public static boolean estValide(int jour, int mois, int annee) {
		boolean valide = true;

		switch (mois) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			if (jour < 1 || jour > 31) {
				valide = false;
			}
		}
			break;
		case 2: {
			if (jour < 1 || jour > 29) {
				valide = false;
			} else if (jour == 29 && !estBissextile(annee)) {
				valide = false;
			}
		}
			break;
		default:
			valide = false;

		}
		return valide;
	}
}