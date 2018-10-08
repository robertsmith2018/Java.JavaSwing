import javax.swing.JOptionPane;

/**
 * @author Portable
 *
 */
public class Exercise2a {

	public static void main(String[] args) {

		int n;
		long fact = 1;
		int compteur = 1;
		String saisie;

		do {
			saisie = JOptionPane.showInputDialog("Donner un nombre pour calculer son factorielle");
			n = Integer.parseInt(saisie);

		} while (n < 0);

		while (compteur <= n) {
			fact *= compteur;
			compteur++;

		}

		JOptionPane.showInputDialog("Le Factorielle de " + n + " est " + fact);

	}

}
