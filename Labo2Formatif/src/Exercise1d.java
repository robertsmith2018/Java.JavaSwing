import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Exercise1d {

	private static int compteur;
	private static int nombre;
	private static int somme;
	private static int produit;
	private static int n;
	private static int x;
	private static int continuer;
	private static double moyenne;

	public static void main(String[] args) {

		do {

			boolean ok;
			n++;
			do // boucle de lecture d'une valeur jusqu'a correcte
			{
				ok = false;
				String saisie;
				try {
					saisie = JOptionPane.showInputDialog(null, "Donner Le nombre de valeurs à saisir",
							"NOMBRES DE VALEURS", JOptionPane.QUESTION_MESSAGE);
					n = Integer.parseInt(saisie);
					if (saisie == null) {
						continue; // si action sur Cancel ou fermeture
					}

					for (compteur = 1; compteur <= n; compteur++) {
						saisie = JOptionPane.showInputDialog("Entrer la " + compteur + " e valeur");
						nombre = Integer.parseInt(saisie);
						somme += nombre;
						produit *= nombre;
					}
					moyenne = (double) somme / n;

					JOptionPane.showInputDialog(null, "La Somme des nombres est : " + somme
							+ "\nLe produit des hombres est : " + produit + "\nLa moyenne des hombres est " + moyenne);

					ok = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Veuillez Entrez SVP un chiffre:");
				}
			} while (ok = false);

			continuer = JOptionPane.showConfirmDialog(null, "Avez-vous encore des valeurs ? ", "MOYENNES",
					JOptionPane.YES_NO_OPTION);

		} while (continuer == JOptionPane.YES_OPTION);

	}

}
