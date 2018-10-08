import javax.swing.JOptionPane;

public class Exo1 {

	public static void main(String[] args) {
		int n = 0;
		double x = 0, somme = 0, moyenne;
		int continuer;
		// lecture des differentes valeurs
		do {
			
			boolean ok;
			n++;
			
			do // boucle de lecture d'une valeur jusqu'a correcte
			{
				ok = false;
				String rep = (String) JOptionPane.showInputDialog(null, "Veuillez Entrer la " + n + " valeur ",
						"MOYENNES", JOptionPane.QUESTION_MESSAGE);
				if (rep == null)
					continue; // si action sur Cancel ou fermeture
				try {
					x = Double.parseDouble(rep);
					ok = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "reponse incorrecte");
				}
			} while (!ok);
			somme += x;
			continuer = JOptionPane.showConfirmDialog(null, "Avez-vous encore des valeurs ? ", "MOYENNES",
					JOptionPane.YES_NO_OPTION);
			
			
			} while (continuer == JOptionPane.YES_OPTION);
		// calcul de la moyenne et affichage
		moyenne = somme / n;
		JOptionPane.showMessageDialog(null, "moyenne des " + n + " valeurs = " + moyenne, "RESULTATS",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
